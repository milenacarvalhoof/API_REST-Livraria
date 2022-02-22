package gft.livraria.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gft.livraria.entities.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long>{

	Page<Autor> findAll(Pageable pageable);
}
