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

import gft.livraria.dto.autor.AutorMapper;
import gft.livraria.dto.autor.ConsultaAutorDTO;
import gft.livraria.dto.autor.RegistroAutorDTO;
import gft.livraria.entities.Autor;
import gft.livraria.services.AutorService;

@RestController
@RequestMapping("v1/autores")
public class AutorController {
	
	private final AutorService autorService;

	public AutorController(AutorService autorService) {
		this.autorService = autorService;
	}
	
	@GetMapping
	public ResponseEntity<Page<ConsultaAutorDTO>> buscarTodosAutores(@PageableDefault Pageable pageable){
		
		return ResponseEntity.ok(autorService.listarTodosAutores(pageable).map(AutorMapper::fromEntity));
	}
	
	@PostMapping
	public Autor salvarAutor(@RequestBody RegistroAutorDTO dto){
		
		Autor autor = new Autor(null, dto.getNome(), null);
		
		return autorService.salvarAutor(autor);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<ConsultaAutorDTO> buscarAutor(@PathVariable Long id) {
		Autor autor = autorService.buscarAutor(id);
		return ResponseEntity.ok(AutorMapper.fromEntity(autor));
	}
	
	@PutMapping("{id}")
	public ResponseEntity<ConsultaAutorDTO> atualizarAutor(@RequestBody RegistroAutorDTO dto, @PathVariable Long id){
		
		try {
			
			Autor autor = autorService.atualizarAutor(AutorMapper.fromDTO(dto), id);
			
			return ResponseEntity.ok(AutorMapper.fromEntity(autor));
		
		} catch (Exception ex) {
			return ResponseEntity.notFound().build();
		}
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<ConsultaAutorDTO> excluirProduto(@PathVariable Long id){
		
		try {
			autorService.excluirAutor(id);
			return ResponseEntity.ok().build();
		} catch (RuntimeException e) {
			return ResponseEntity.notFound().build();
		}
		
	}

}
