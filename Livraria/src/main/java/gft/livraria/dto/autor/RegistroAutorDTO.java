package gft.livraria.dto.autor;

public class RegistroAutorDTO {
	
	private String nome;
	
	public RegistroAutorDTO() {}

	public RegistroAutorDTO(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
