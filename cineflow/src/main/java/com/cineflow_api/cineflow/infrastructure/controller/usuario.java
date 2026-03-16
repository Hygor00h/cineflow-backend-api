package com.cineflow_api.cineflow.infrastructure.controller;

import com.cineflow_api.cineflow.infrastructure.service.UsuarioService;
import com.exemplo.api.AuthApi;
import com.exemplo.model.UsuarioCadastro;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class usuario implements AuthApi {

	private final UsuarioService usuarioService;

	public usuario(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	@Override
	public ResponseEntity<Void> authCadastroPost(UsuarioCadastro usuarioCadastro) {
		return ResponseEntity.ok(usuarioService.UsuarioCadastro(usuarioCadastro));
	}
}
