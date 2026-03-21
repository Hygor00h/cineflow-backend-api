package com.cineflow_api.cineflow.infrastructure.controller;

import com.cineflow_api.cineflow.infrastructure.security.JwtUtil;
import com.cineflow_api.cineflow.infrastructure.service.UsuarioService;
import com.exemplo.api.AuthApi;
import com.exemplo.model.LoginRequest;
import com.exemplo.model.TokenResponse;
import com.exemplo.model.UsuarioCadastro;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController implements AuthApi {

	private final UsuarioService usuarioService;
	private final JwtUtil jwtUtil;
	private final AuthenticationManager authenticationManager;

	public AuthController(UsuarioService usuarioService, JwtUtil jwtUtil, AuthenticationManager authenticationManager) {
		this.usuarioService = usuarioService;
		this.jwtUtil = jwtUtil;
		this.authenticationManager = authenticationManager;
	}

	@Override
	public ResponseEntity<Void> authCadastroPost(UsuarioCadastro usuarioCadastro) {
		return ResponseEntity.ok(usuarioService.UsuarioCadastro(usuarioCadastro));
	}

	@Override
	public ResponseEntity<TokenResponse> authLoginPost(LoginRequest loginRequest) {
		Authentication authentication = authenticationManager.authenticate(
						new UsernamePasswordAuthenticationToken(loginRequest.getEmail(),
										loginRequest.getSenha()));
		String tokenGerado = jwtUtil.generateToken(authentication.getName());
		TokenResponse tokenResponse = new TokenResponse();
		tokenResponse.setAccessToken(tokenGerado);
		tokenResponse.setTipo("Bearer");
		tokenResponse.setExpiresIn(3600);

		return ResponseEntity.ok(tokenResponse);
	}



}
