package br.com.letscode.moviesbattle.dto;

import java.time.LocalDateTime;

import org.springframework.data.domain.Page;

import br.com.letscode.moviesbattle.model.Partida;

public class PartidaDTO {
	
	private Long id; 

	private String nomeUsuario;
	
	private FilmeDTO esquerdaFilme;
	
	private FilmeDTO direitaFilme;
	
	private LocalDateTime data;
	
	private String status;
	
	public PartidaDTO(Partida partida) {
		this.id = partida.getId();
		this.nomeUsuario = partida.getUsuario().getNome();
		this.esquerdaFilme = new FilmeDTO(partida.getEsquerdaFilme());
		this.direitaFilme = new FilmeDTO(partida.getDireitaFilme());
		this.data = partida.getData();
		this.status = partida.getStatus().name();
	} 
	
	public static Page<PartidaDTO> converter(Page<Partida> partidas) {
		return partidas.map(PartidaDTO::new);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public FilmeDTO getEsquerdaFilme() {
		return esquerdaFilme;
	}

	public void setEsquerdaFilme(FilmeDTO esquerdaFilme) {
		this.esquerdaFilme = esquerdaFilme;
	}

	public FilmeDTO getDireitaFilme() {
		return direitaFilme;
	}

	public void setDireitaFilme(FilmeDTO direitaFilme) {
		this.direitaFilme = direitaFilme;
	}

}