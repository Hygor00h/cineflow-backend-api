package com.cineflow_api.cineflow.infrastructure.model.enums;

public enum RoleUser {

	ADMIN("ROLE_ADMIN"),
	USER("ROLE_USER");
	private String role;
	RoleUser(String role){
		this.role = role;
	}

	public String getRole(){
		return this.role;
	}

}
