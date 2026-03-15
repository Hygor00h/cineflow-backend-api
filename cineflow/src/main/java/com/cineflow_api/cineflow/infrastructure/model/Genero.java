package com.cineflow_api.cineflow.infrastructure.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("generos")
public class Genero {

	@Id
	private Integer id;
	private String nome;


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
