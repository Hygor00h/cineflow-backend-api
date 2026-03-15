package com.cineflow_api.cineflow.infrastructure.model;

import com.cineflow_api.cineflow.infrastructure.model.enums.TipoIngresso;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("ingressos")
public class Ingresso {

	@Id
	private Integer id;

	@Column("sessao_id")
	private Integer sessaoId;

	private TipoIngresso tipoIngresso;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSessaoId() {
		return sessaoId;
	}

	public void setSessaoId(Integer sessaoId) {
		this.sessaoId = sessaoId;
	}

	public TipoIngresso getTipoIngresso() {
		return tipoIngresso;
	}

	public void setTipoIngresso(TipoIngresso tipoIngresso) {
		this.tipoIngresso = tipoIngresso;
	}
}
