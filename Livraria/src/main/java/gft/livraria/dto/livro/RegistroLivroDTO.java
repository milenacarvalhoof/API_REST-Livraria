package gft.livraria.dto.livro;

public class RegistroLivroDTO {
	
	private String tema;
	private String genero;
	private Long autorId;
	private int qtdPaginas;
	private String nomeAutor;
	
	public RegistroLivroDTO() {}

	public RegistroLivroDTO(String tema, String genero, Long autorId, int qtdPaginas) {
		this.tema = tema;
		this.genero = genero;
		this.autorId = autorId;
		this.qtdPaginas = qtdPaginas;
	}

	public RegistroLivroDTO(String nomeAutor) {
		this.nomeAutor = nomeAutor;
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

	public Long getAutorId() {
		return autorId;
	}

	public void setAutor(Long autorId) {
		this.autorId = autorId;
	}

	public int getQtdPaginas() {
		return qtdPaginas;
	}

	public void setQtdPaginas(int qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public void setAutorId(Long autorId) {
		this.autorId = autorId;
	}
}
