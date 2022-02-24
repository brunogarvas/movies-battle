package br.com.letscode.moviesbattle.api;

import java.net.URI;
import java.security.Principal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.letscode.moviesbattle.dto.PartidaDTO;
import br.com.letscode.moviesbattle.model.Filme;
import br.com.letscode.moviesbattle.model.Partida;
import br.com.letscode.moviesbattle.model.StatusPartida;
import br.com.letscode.moviesbattle.model.Usuario;
import br.com.letscode.moviesbattle.repository.FilmeRepository;
import br.com.letscode.moviesbattle.repository.PartidaRepository;
import br.com.letscode.moviesbattle.repository.UsuarioRepository;

@RestController
@RequestMapping("/api/partidas")
public class PartidasRest {

	@Autowired
	private PartidaRepository partidaRepository;
	
	@Autowired
	private FilmeRepository filmeRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping
	@Cacheable(value = "listaDePartidas")
	public Page<PartidaDTO> lista(@RequestParam(required = false) String usuario, 
			  @PageableDefault(page = 0, size = 10, sort = "data", direction = Direction.DESC) Pageable paginacao) {
		
		if (usuario == null) {
			Page<Partida> partidas = partidaRepository.findAll(paginacao);
			return PartidaDTO.converter(partidas);
		} else {
			Page<Partida> partidas = partidaRepository.findByUsuarioUsername(usuario, paginacao);
			return PartidaDTO.converter(partidas);
		}
		
	}
	
	@GetMapping("usuario/{status}")
	public Page<PartidaDTO> status(@PathVariable("status") String status, Principal principal, 
			@PageableDefault(page = 0, size = 10, sort = "data", direction = Direction.DESC) Pageable paginacao) {
		
		Page<Partida> partidas = partidaRepository.findByStatusAndUsername(
			StatusPartida.valueOf(status.toUpperCase()), principal.getName(), paginacao);
		
		return PartidaDTO.converter(partidas);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PartidaDTO> detalhe(@PathVariable Long id) {
		Optional<Partida> partida = partidaRepository.findById(id);
		if(partida.isPresent()) {
			return ResponseEntity.ok(new PartidaDTO(partida.get()));			
		}
		return ResponseEntity.notFound().build();
	}
	
	@GetMapping("inicia")
	public ResponseEntity<PartidaDTO> inicia(UriComponentsBuilder uriBuilder) {
		
		if (SecurityContextHolder.getContext().getAuthentication().isAuthenticated()) {
			
			String username = SecurityContextHolder.getContext().getAuthentication().getName();
			Optional<Usuario> usuario = usuarioRepository.findById(username);
		
			if (usuario.isPresent()) {
				
				List<Filme> filmesPartida = filmeRepository.obterListaAleatoriaFilmesParaBatalha();
				
				if (!filmesPartida.isEmpty()) {
					
					Partida partida = new Partida();
					partida.setUsuario(usuario.get());
					partida.setEsquerdaFilme(filmesPartida.get(0));
					partida.setDireitaFilme(filmesPartida.get(1));
					
					partidaRepository.save(partida);
					
					URI uri = uriBuilder.path("/partidas/{id}").buildAndExpand(partida.getId()).toUri();
					
					return ResponseEntity.created(uri).body(new PartidaDTO(partida));
				}
			
				return ResponseEntity.notFound().build();
			}
			
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.notFound().build();
	}
	
}