package gft.livraria.dto.livro;

import gft.livraria.dto.autor.RegistroAutorDTO;

public class ConsultaLivroDTO {
	
	private Long id;	
	private String tema;
	private String genero;
	private RegistroAutorDTO autor;	
	private int qtdPaginas;
	
	public ConsultaLivroDTO() {}

	public ConsultaLivroDTO(Long id, String tema, String genero, RegistroAutorDTO autor, int qtdPaginas) {
		this.id = id;
		this.tema = tema;
		this.genero = genero;
		this.autor = autor;
		this.qtdPaginas = qtdPaginas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public RegistroAutorDTO getAutor() {
		return autor;
	}

	public void setAutor(RegistroAutorDTO autor) {
		this.autor = autor;
	}

	public int getQtdPaginas() {
		return qtdPaginas;
	}

	public void setQtdPaginas(int qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}
}
