package br.com.letscode.moviesbattle.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.letscode.moviesbattle.model.Partida;
import br.com.letscode.moviesbattle.model.StatusPartida;

@Repository
public interface PartidaRepository extends JpaRepository<Partida, Long> {
	
	Page<Partida> findByUsuarioUsername(String username, Pageable paginacao);

	@Query("select p from Partida p where p.usuario = :username and p.status = :status")
	Page<Partida> findByStatusAndUsername(@Param("status") StatusPartida status, @Param("username") String username, Pageable paginacao);
}
