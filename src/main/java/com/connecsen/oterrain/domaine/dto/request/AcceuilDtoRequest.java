package com.connecsen.oterrain.domaine.dto.request;

import com.connecsen.oterrain.domaine.Fichier;
import com.connecsen.oterrain.domaine.HomeOne;
import com.connecsen.oterrain.domaine.Propos;
import com.connecsen.oterrain.domaine.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data @AllArgsConstructor @NoArgsConstructor
public class AcceuilDtoRequest {
	private Long id;
	private HomeOne homeone;
	private Fichier fichier;
	private Propos propos;
	private Service service;

}
