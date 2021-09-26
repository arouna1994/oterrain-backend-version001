package com.connecsen.oterrain.domaine.dto.response;

import com.connecsen.oterrain.domaine.Fichier;
import com.connecsen.oterrain.domaine.HomeOne;
import com.connecsen.oterrain.domaine.Propos;
import com.connecsen.oterrain.domaine.Service;
import com.connecsen.oterrain.domaine.Terrain;

import lombok.Data;
@Data
public class MultimediaDtoResponse {
	private Long id;
	private String file ;
	private HomeOne homeone;
	private Fichier fichier;
	private Propos propos;
	private Service service;
	private Terrain terrain ;
	public MultimediaDtoResponse() {
		super();
	}
	public MultimediaDtoResponse(String file, HomeOne homeone, Fichier fichier, Propos propos, Service service, Terrain terrain) {
		super();
		this.file = file;
		this.homeone = homeone;
		this.fichier = fichier;
		this.propos = propos;
		this.service = service;
		this.terrain = terrain;
	}
	public MultimediaDtoResponse(Long id, String file, HomeOne homeone, Fichier fichier, Propos propos, Service service,
			Terrain terrain) {
		super();
		this.id = id;
		this.file = file;
		this.homeone = homeone;
		this.fichier = fichier;
		this.propos = propos;
		this.service = service;
		this.terrain = terrain;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	
	public void setHomeone(HomeOne homeone) {
		this.homeone = homeone;
	}
	
	public void setFichier(Fichier fichier) {
		this.fichier = fichier;
	}
	
	public void setPropos(Propos propos) {
		this.propos = propos;
	}
	
	public void setService(Service service) {
		this.service = service;
	}
	
	public void setTerrain(Terrain terrain) {
		this.terrain = terrain;
	}

	
}
