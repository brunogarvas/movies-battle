package br.com.letscode.moviesbattle.api;

import java.net.URI;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.letscode.moviesbattle.dto.FilmeDTO;
import br.com.letscode.moviesbattle.form.FilmeFormulario;
import br.com.letscode.moviesbattle.model.Filme;
import br.com.letscode.moviesbattle.repository.FilmeRepository;

@RestController
@RequestMapping("/api/filmes")
public class FilmesRest {

	@Autowired
	private FilmeRepository filmeRepository;
	
	@GetMapping
	@Cacheable(value = "listaDeFilmes")
	public Page<FilmeDTO> lista(@PageableDefault(page = 0, size = 100, sort = "titulo", direction = Direction.ASC) Pageable paginacao) {
		Page<Filme> filmes = filmeRepository.findAll(paginacao);
		return FilmeDTO.converter(filmes);
	}
	
	@PostMapping
	@Transactional
	@CacheEvict(value = "listaDeFilmes", allEntries = true)
	public ResponseEntity<FilmeDTO> cadastro(@RequestBody @Valid FilmeFormulario form, UriComponentsBuilder uriBuilder) {
		
		Filme filme = form.converter();
		filmeRepository.save(filme);
		
		URI uri = uriBuilder.path("/api/filmes/{id}").buildAndExpand(filme.getId()).toUri();
		
		return ResponseEntity.created(uri).body(new FilmeDTO(filme));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<FilmeDTO> detalhe(@PathVariable Long id) {
		Optional<Filme> topico = filmeRepository.findById(id);
		if(topico.isPresent()) {
			return ResponseEntity.ok(new FilmeDTO(topico.get()));			
		}
		return ResponseEntity.notFound().build();
	}
	
	@PutMapping("/{id}")
	@Transactional
	@CacheEvict(value = "listaDeFilmes", allEntries = true)
	public ResponseEntity<FilmeDTO> atualiza(@PathVariable Long id, @RequestBody @Valid FilmeFormulario form) {
	    Optional<Filme> optional = filmeRepository.findById(id);
		if(optional.isPresent()) {
			Filme filme = form.atualizar(id, filmeRepository);
			return ResponseEntity.ok(new FilmeDTO(filme));
		}
		return ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	@CacheEvict(value = "listaDeFilmes", allEntries = true)
	public ResponseEntity<?> remove(@PathVariable Long id) {
		Optional<Filme> optional = filmeRepository.findById(id);
		if(optional.isPresent()) {
			filmeRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
	}

}