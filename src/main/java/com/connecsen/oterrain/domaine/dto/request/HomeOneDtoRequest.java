package com.connecsen.oterrain.domaine.dto.request;

import com.connecsen.oterrain.domaine.Multimedia;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class HomeOneDtoRequest {
	private Long id;
	private String titre;
	private String description;
	private Multimedia multimedia;
	private String bouton;
	
}
