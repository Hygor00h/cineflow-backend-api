package com.cineflow_api.cineflow.infrastructure.repository;

import com.cineflow_api.cineflow.infrastructure.model.Usuarios;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;
import java.util.UUID;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuarios, UUID> {

//	@Query("SELECT * FROM usuarios WHERE email = :email")
//	Optional<Usuarios> findByEmail(String email);

	Boolean existsByEmail(String email);

	Optional<Usuarios> findByEmail(String email);
}
