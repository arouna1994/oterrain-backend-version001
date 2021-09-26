package com.connecsen.oterrain.domaine.dto.response;

import com.connecsen.oterrain.domaine.Multimedia;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class ServiceDtoResponse {
	private Long id;
	private String titre;
	private String description;
	private Multimedia multimedia;
}
