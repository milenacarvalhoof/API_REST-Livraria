package gft.livraria.controllers;

import javax.security.sasl.AuthenticationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gft.livraria.dto.auth.AutenticacaoDTO;
import gft.livraria.dto.auth.TokenDTO;
import gft.livraria.services.AutenticacaoService;

@RestController
@RequestMapping("/v1/auth")
public class AutenticacaoController {
	
	private final AutenticacaoService authService;
	
	public AutenticacaoController(AutenticacaoService authService) {
		this.authService = authService;
	}
	
	@PostMapping
	public ResponseEntity<TokenDTO> autenticar(@RequestBody AutenticacaoDTO autoForm){
		
		try {
			return ResponseEntity.ok(authService.autenticar(autoForm));
		}catch(AuthenticationException ae) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}
	}

}
