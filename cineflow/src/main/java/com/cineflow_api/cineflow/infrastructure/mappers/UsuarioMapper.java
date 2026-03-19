package com.cineflow_api.cineflow.infrastructure.mappers;

import com.cineflow_api.cineflow.infrastructure.model.Usuarios;

import com.exemplo.model.UsuarioCadastro;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

	UsuarioCadastro toDto(Usuarios usuario);

	Usuarios toEntity(UsuarioCadastro usuarioCadastro);

}
