package com.cineflow_api.cineflow.infrastructure.controller;

import com.exemplo.api.AdminApi;
import com.exemplo.model.Filme;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CinemaController implements AdminApi {


	@Override
	public ResponseEntity<Void> adminFilmesPost(Filme filme) {
		return AdminApi.super.adminFilmesPost(filme);
	}
}
