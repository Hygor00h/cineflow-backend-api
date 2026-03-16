package com.cineflow_api.cineflow.infrastructure.service;

import com.cineflow_api.cineflow.infrastructure.exception.ConflictException;
import com.cineflow_api.cineflow.infrastructure.mappers.UsuarioMapper;
import com.cineflow_api.cineflow.infrastructure.model.Usuarios;
import com.cineflow_api.cineflow.infrastructure.repository.UsuarioRepository;
import com.cineflow_api.cineflow.infrastructure.security.JwtUtil;
import com.exemplo.model.UsuarioCadastro;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

	private final UsuarioRepository usuarioRepository;
	private final PasswordEncoder passwordEncoder;
	private final JwtUtil	jwtUtil;
	private final UsuarioMapper usuarioMapper;

	public Void UsuarioCadastro(UsuarioCadastro usuarioCadastro) {
		validarEmail(usuarioCadastro.getEmail());
		usuarioCadastro.setSenha(passwordEncoder.encode(usuarioCadastro.getSenha()));
		Usuarios usuarios = usuarioMapper.toEntity(usuarioCadastro);
		usuarioRepository.save(usuarios);
		return null;
	}

	public void validarEmail(String email) {
		usuarioRepository.findByEmail(email)
						.ifPresent(usuario -> {throw new ConflictException("Email já cadastrado");
						});
	}

}
