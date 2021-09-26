package com.connecsen.oterrain.domaine.dto.response;

import com.connecsen.oterrain.domaine.Multimedia;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class ProposDtoResponse {
	private Long id;
	private String titre;
	private String text;
	private Multimedia multimedia;
	private String urlVideo;
	private String telephone;
	private String email;
	private String adresse;
}
