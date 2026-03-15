package com.cineflow_api.cineflow.infrastructure.controller;

import com.exemplo.api.AdminApi;
import com.exemplo.model.Filme;
import org.springframework.http.ResponseEntity;

public class admRest implements AdminApi {


	@Override
	public ResponseEntity<Void> adminFilmesPost(Filme filme) {
		return AdminApi.super.adminFilmesPost(filme);
	}
}
