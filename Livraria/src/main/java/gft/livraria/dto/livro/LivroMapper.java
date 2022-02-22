package gft.livraria.dto.livro;

import java.util.ArrayList;
import java.util.List;

import gft.livraria.dto.autor.AutorMapper;
import gft.livraria.entities.Autor;
import gft.livraria.entities.Livro;

public class LivroMapper {
	
	public static Livro fromDTO(RegistroLivroDTO dto) {
		
		Autor autor = new Autor();
		autor.setId(dto.getAutorId());
		
		return new Livro(null, dto.getTema(), dto.getGenero(), autor, dto.getQtdPaginas());
	}
	
	public static ConsultaLivroDTO fromEntity(Livro livro) {
		return new ConsultaLivroDTO(livro.getId(), livro.getTema(), livro.getGenero(), AutorMapper.autorDTO(livro.getAutor()), livro.getQtdPaginas());
	}
	
	public static RegistroLivroDTO livroDTO(Livro livro) {
		return new RegistroLivroDTO(livro.getTema(), livro.getGenero(), livro.getAutor().getId(), livro.getQtdPaginas());
	}

	public static List<String> ListaLivros(List<RegistroLivroDTO> livros) {
		
		List<String> listaLivrosNome = new ArrayList<>();
		
		for (RegistroLivroDTO livroDTO : livros) {
			listaLivrosNome.add(livroDTO.getTema());
		}
		return listaLivrosNome;
	}
	
	public static List<String> ListaLivrosDTO(List<Livro> livros) {
		
		List<String> listaLivrosDTO = new ArrayList<>();
		
		for (Livro livro : livros) {
			listaLivrosDTO.add(livro.getTema());
		}
		return listaLivrosDTO;
	}

}
