package com.connecsen.oterrain.domaine.dto.request;

import java.util.Date;

import com.connecsen.oterrain.domaine.Multimedia;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class PubDtoRequest {
	private Long id;
	private String endroit;
	private Date dateDebut;
	private Date dateFin;
	private String urlPub;
	private Multimedia multimedia;
}
