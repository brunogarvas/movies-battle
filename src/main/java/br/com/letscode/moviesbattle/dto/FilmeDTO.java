package br.com.letscode.moviesbattle.dto;

import org.springframework.data.domain.Page;

import br.com.letscode.moviesbattle.model.Filme;

public class FilmeDTO {

	private Long id;
	
	private String titulo;
	
	private String sinopse;
	
	private String diretor;
	
	private String elenco;
	
	private String genero;
	
	private Integer duracao;
	
	private Integer ano;
	
	private String urlPoster;
	
	private String urlIMDB;
	
	public FilmeDTO(Filme filme) {
		this.id = filme.getId();
		this.titulo = filme.getTitulo();
		this.sinopse = filme.getSinopse();
		this.diretor = filme.getDiretor();
		this.elenco = filme.getElenco();
		this.genero = filme.getGenero();
		this.duracao = filme.getDuracao();
		this.ano = filme.getAno();
		this.urlIMDB = filme.getUrlImdb();
		this.urlPoster = filme.getUrlPoster();
	}

	public static Page<FilmeDTO> converter(Page<Filme> filmes) {
		return filmes.map(FilmeDTO::new);
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

	public String getUrlIMDB() {
		return urlIMDB;
	}

	public void setUrlIMDB(String urlIMDB) {
		this.urlIMDB = urlIMDB;
	}
	
}