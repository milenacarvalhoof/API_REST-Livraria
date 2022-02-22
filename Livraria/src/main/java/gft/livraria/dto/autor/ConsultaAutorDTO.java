package gft.livraria.dto.autor;

import java.util.List;

public class ConsultaAutorDTO {
	
	private Long id;
	private String nome;
	private List<String> livrosNome;
	
	public ConsultaAutorDTO() {}

	public ConsultaAutorDTO(Long id, String nome, List<String> livrosNome) {
		this.id = id;
		this.nome = nome;
		this.livrosNome = livrosNome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getLivros() {
		return livrosNome;
	}

	public void setLivros(List<String> livrosNome) {
		this.livrosNome = livrosNome;
	}
}
