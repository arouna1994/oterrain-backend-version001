package com.connecsen.oterrain.domaine.dto.request;

import com.connecsen.oterrain.domaine.Multimedia;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class ServiceDtoRequest {
	private Long id;
	private String titre;
	private Multimedia multimedia;
	private String description;
}
