package com.connecsen.oterrain.domaine.dto.request;

import com.connecsen.oterrain.domaine.Multimedia;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class FichierDtoRequest {
	private Long id;
	private String typeFichier;
	private Multimedia multimedia;
	private String description;
}
