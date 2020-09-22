package br.com.fiap.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import br.com.fiap.domain.Usuario;

public interface UsuarioRepository extends PagingAndSortingRepository<Usuario, Long> {
	List<Usuario> findByCpfContaining(@Param("q") String q);

	List<Usuario> findByNome(@Param("q") String q);
}
