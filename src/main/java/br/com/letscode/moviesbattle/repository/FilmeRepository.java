package br.com.letscode.moviesbattle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.letscode.moviesbattle.model.Filme;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long> {

	@Query("select f from Filme f order by RAND()")
	List<Filme> obterListaAleatoriaFilmesParaBatalha();
	
}
