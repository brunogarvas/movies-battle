package br.com.letscode.moviesbattle.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Filme {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String titulo;
	
	private String sinopse;
	
	private String diretor;
	
	private String elenco;
	
	private String genero;
	
	private Integer duracao;
	
	private Integer ano;
	
	private String urlPoster;
	
	private String urlImdb;
	
	private Double notaImdb;
	
	private Long votosImdb;

	public BigDecimal getPontuacao() {
		if (notaImdb == null || votosImdb == null) {
			return BigDecimal.ZERO;
		}
		return BigDecimal.valueOf(notaImdb).multiply(BigDecimal.valueOf(votosImdb));
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getElenco() {
		return elenco;
	}

	public void setElenco(String elenco) {
		this.elenco = elenco;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getUrlPoster() {
		return urlPoster;
	}

	public void setUrlPoster(String urlPoster) {
		this.urlPoster = urlPoster;
	}

	public String getUrlImdb() {
		return urlImdb;
	}

	public void setUrlImdb(String urlImdb) {
		this.urlImdb = urlImdb;
	}

	public Double getNotaImdb() {
		return notaImdb;
	}

	public void setNotaImdb(Double notaImdb) {
		this.notaImdb = notaImdb;
	}

	public Long getVotosImdb() {
		return votosImdb;
	}

	public void setVotosImdb(Long votosImdb) {
		this.votosImdb = votosImdb;
	}
	
}