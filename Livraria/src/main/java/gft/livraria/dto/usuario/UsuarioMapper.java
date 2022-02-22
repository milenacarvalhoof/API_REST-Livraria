package gft.livraria.dto.usuario;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import gft.livraria.entities.Perfil;
import gft.livraria.entities.Usuario;

public class UsuarioMapper {
	
	public static Usuario fromDTO(RegistroUsuarioDTO dto) {
		
		Perfil perfil = new Perfil();
		perfil.setId(dto.getPerfilId());
		
		return new Usuario(null, dto.getUsuario(), new BCryptPasswordEncoder().encode(dto.getSenha()), perfil);
	}
	
	public static ConsultaUsuarioDTO fromEntity(Usuario usuario) {
		
		return new ConsultaUsuarioDTO(usuario.getUsuario(), usuario.getPerfil().getNome());
	
	}

}
