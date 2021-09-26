package com.connecsen.oterrain.domaine.dto.response;

import com.connecsen.oterrain.domaine.Multimedia;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class HomeOneDtoResponse {
	private Long id;
	private String titre;
	private String description;
	private String bouton;
	private Multimedia multimedia;
}
