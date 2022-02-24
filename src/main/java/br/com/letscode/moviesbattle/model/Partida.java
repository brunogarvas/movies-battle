package br.com.letscode.moviesbattle.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Partida {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "username")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name = "id_filme_esquerda")
	private Filme esquerdaFilme;
	
	@ManyToOne
	@JoinColumn(name = "id_filme_direita")
	private Filme direitaFilme;
	
	@Enumerated(EnumType.STRING)
	private StatusPartida status = StatusPartida.INICIADA;
	
	private LocalDateTime data = LocalDateTime.now();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}
	
	public Filme getEsquerdaFilme() {
		return esquerdaFilme;
	}

	public void setEsquerdaFilme(Filme esquerdaFilme) {
		this.esquerdaFilme = esquerdaFilme;
	}

	public Filme getDireitaFilme() {
		return direitaFilme;
	}

	public void setDireitaFilme(Filme direitaFilme) {
		this.direitaFilme = direitaFilme;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public StatusPartida getStatus() {
		return status;
	}

	public void setStatus(StatusPartida status) {
		this.status = status;
	}
	
}