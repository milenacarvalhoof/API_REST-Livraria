package gft.livraria.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gft.livraria.dto.livro.ConsultaLivroDTO;
import gft.livraria.dto.livro.LivroMapper;
import gft.livraria.dto.livro.RegistroLivroDTO;
import gft.livraria.entities.Livro;
import gft.livraria.services.LivroService;

@RestController
@RequestMapping("v1/livros")
public class LivroController {
	
	private final LivroService livroService;

	public LivroController(LivroService livroService) {
		this.livroService = livroService;
	}
	
	@GetMapping
	public ResponseEntity<Page<ConsultaLivroDTO>> buscarTodosLivros(@PageableDefault Pageable pageable){
		
		return ResponseEntity.ok(livroService.listarTodosLivros(pageable).map(LivroMapper::fromEntity));
	}
	
	@PostMapping
	public ResponseEntity<ConsultaLivroDTO> salvarLivro(@RequestBody RegistroLivroDTO dto){
		
		Livro livro = livroService.salvarLivro(LivroMapper.fromDTO(dto));
		
		return ResponseEntity.ok(LivroMapper.fromEntity(livro));
	}
	
	@GetMapping("{id}")
	public ResponseEntity<ConsultaLivroDTO> buscarLivro(@PathVariable Long id) {
		Livro livro = livroService.buscarLivro(id);
		return ResponseEntity.ok(LivroMapper.fromEntity(livro));
	}
	
	@PutMapping("{id}")
	public ResponseEntity<ConsultaLivroDTO> atualizarLivro(@RequestBody RegistroLivroDTO dto, @PathVariable Long id){
		
		try {
			Livro livro = livroService.atualizarLivro(LivroMapper.fromDTO(dto), id);
			return ResponseEntity.ok(LivroMapper.fromEntity(livro));
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<ConsultaLivroDTO> excluirLivro(@PathVariable Long id){
		
		try {
			livroService.excluirLivro(id);
			return ResponseEntity.ok().build();
		} catch (RuntimeException e) {
			return ResponseEntity.notFound().build();
		}
		
	}

}
