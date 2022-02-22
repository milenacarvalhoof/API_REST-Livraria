package gft.livraria.services;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import gft.livraria.entities.Autor;
import gft.livraria.repositories.AutorRepository;

@Service
public class AutorService {
	
	private final AutorRepository autorRepository;

	public AutorService(AutorRepository autorRepository) {
		this.autorRepository = autorRepository;
	}
	
	public Autor salvarAutor(Autor autor) {
		return autorRepository.save(autor);
	}
	
	public Page<Autor> listarTodosAutores(Pageable pageable){
		return autorRepository.findAll(pageable);
	}
	
	public Autor buscarAutor(Long id){
		
		Optional<Autor> autor = autorRepository.findById(id);
		
		return autor.orElseThrow(() -> new EntityNotFoundException("Autor não encontrado!"));
	}

	public Autor atualizarAutor(Autor autor, Long id) {
		Autor autorOriginal = this.buscarAutor(id);
		
		autor.setId(autorOriginal.getId());
		
		return autorRepository.save(autor);
	}
	
	public void excluirAutor(Long id) {
		Autor autor = this.buscarAutor(id);
		
		autorRepository.delete(autor);
	}
}
