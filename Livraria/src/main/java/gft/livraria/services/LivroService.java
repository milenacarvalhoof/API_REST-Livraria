package gft.livraria.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import gft.livraria.entities.Livro;
import gft.livraria.exception.EntityNotFoundException;
import gft.livraria.repositories.LivroRepository;

@Service
public class LivroService {
	
	private final LivroRepository livroRepository;

	public LivroService(LivroRepository livroRepository) {
		this.livroRepository = livroRepository;
	}
	
	public Livro salvarLivro(Livro livro) {
		return livroRepository.save(livro);
	}
	
	public Page<Livro> listarTodosLivros(Pageable pageable){
		return livroRepository.findAll(pageable);
	}
	
	public Livro buscarLivro(Long id) {
		Optional<Livro> livro = livroRepository.findById(id);
		
		return livro.orElseThrow(() -> new EntityNotFoundException("Livro não encontrado!"));
	}
	
	public Livro atualizarLivro(Livro livro, Long id) {
		Livro livroOriginal = this.buscarLivro(id);
		
		livro.setId(livroOriginal.getId());
		
		return livroRepository.save(livro);		
	}

	public void excluirLivro(Long id) {
		Livro livro = this.buscarLivro(id);
		
		livroRepository.delete(livro);
	}
}
