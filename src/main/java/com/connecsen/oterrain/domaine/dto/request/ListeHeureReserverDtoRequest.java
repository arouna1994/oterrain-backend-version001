package com.connecsen.oterrain.domaine.dto.request;

import com.connecsen.oterrain.domaine.Terrain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class ListeHeureReserverDtoRequest {
	private long id ;
	private long indexJour;
	private int numeroJour;
	private int numeroMois;
	private String heure;
	private Terrain terrain;
}
