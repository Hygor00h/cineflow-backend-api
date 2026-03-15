package com.cineflow_api.cineflow.infrastructure.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.jdbc.core.mapping.AggregateReference;
import org.springframework.data.relational.core.mapping.Table;

@Table("filmes")
public class Filme {

	@Id
	private Long id;
	private String titulo;
	private Integer duracao;
	private AggregateReference<Genero, Integer> generoId;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

	public AggregateReference<Genero, Integer> getGeneroId() {
		return generoId;
	}

	public void setGeneroId(AggregateReference<Genero, Integer> generoId) {
		this.generoId = generoId;
	}
}
