package gft.livraria.dto.autor;

import gft.livraria.dto.livro.LivroMapper;
import gft.livraria.entities.Autor;

public class AutorMapper {
	
	public static Autor fromDTO(RegistroAutorDTO dto) {
		return new Autor(null, dto.getNome(), null);
	}
	
	public static RegistroAutorDTO autorDTO(Autor autor) {
		return new RegistroAutorDTO(autor.getNome());
	}
	
	public static ConsultaAutorDTO fromEntity(Autor autor) {
		return new ConsultaAutorDTO(autor.getId(), autor.getNome(), LivroMapper.ListaLivrosDTO(autor.getLivros()));
	}
	
}
