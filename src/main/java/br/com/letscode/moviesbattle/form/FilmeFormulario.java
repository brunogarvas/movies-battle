package br.com.letscode.moviesbattle.form;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.com.letscode.moviesbattle.model.Filme;
import br.com.letscode.moviesbattle.repository.FilmeRepository;

public class FilmeFormulario {

	@NotEmpty @NotNull @Length(min = 3)
	private String titulo;
	
	private String sinopse;
	
	@NotEmpty
	private String diretor;
	
	@NotEmpty
	private String elenco;
	
	private String genero;
	
	private Integer duracao;
	
	@NotNull @Length(max = 4, min = 4)
	private Integer ano;
	
	@NotEmpty
	private String urlPoster;
	
	private String urlImdb;
	
	@NotNull @Min(value = 1L) @Max(value = 10L)
	private Double notaImdb;
	
	@NotNull @Min(value = 1L) 
	private Long votosImdb;

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
		return urlImdb;
	}

	public void setUrlIMDB(String urlIMDB) {
		this.urlImdb = urlIMDB;
	}

	public Double getNotaIMDB() {
		return notaImdb;
	}

	public void setNotaIMDB(Double notaIMDB) {
		this.notaImdb = notaIMDB;
	}

	public Long getVotosIMDB() {
		return votosImdb;
	}

	public void setVotosIMDB(Long votosIMDB) {
		this.votosImdb = votosIMDB;
	}
	
	public Filme converter() {
		Filme filme = new Filme();
		filme.setTitulo(this.titulo);
		this.sinopse = filme.getSinopse();
		this.diretor = filme.getDiretor();
		this.elenco = filme.getElenco();
		this.genero = filme.getGenero();
		this.duracao = filme.getDuracao();
		this.ano = filme.getAno();
		this.urlImdb = filme.getUrlImdb();
		this.urlPoster = filme.getUrlPoster();
		return filme;
	}
	
	public Filme atualizar(Long id, FilmeRepository filmeRepository) {
		Filme filme = filmeRepository.getById(id);
		filme.setSinopse(this.sinopse);
		filme.setElenco(this.elenco);
		filme.setVotosImdb(this.votosImdb);
		filme.setNotaImdb(this.notaImdb);
		filme.setUrlPoster(this.urlImdb);
		filme.setUrlImdb(this.urlImdb);
		return filme;
	}
	
}
