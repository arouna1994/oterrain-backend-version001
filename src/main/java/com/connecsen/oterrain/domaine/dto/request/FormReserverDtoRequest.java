package com.connecsen.oterrain.domaine.dto.request;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data @AllArgsConstructor @NoArgsConstructor
public class FormReserverDtoRequest implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private long idUser;
	private long idTerrain;
	private Date dateDebut;
	private Date dateFin;
	private String heureDebut;
	private String heureFin;
	

}
