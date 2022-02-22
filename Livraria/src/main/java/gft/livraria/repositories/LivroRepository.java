package gft.livraria.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gft.livraria.entities.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{

	Page<Livro> findAll(Pageable pageable);
}
