package com.connecsen.oterrain.domaine.dto.response;

import java.util.ArrayList;

import java.util.List;

import com.connecsen.oterrain.domaine.Match;
import com.connecsen.oterrain.domaine.Multimedia;
import com.connecsen.oterrain.domaine.Tournoi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class EquipeDtoResponse {
	private Long id;
	private String nomEquipe;
	private String raisonSociale;
	private String nomEcole;
	private String numeroTelephone;
	private String ville;
	private String email;
	private String niveau;
	private String nomEntreprise;
	private String typeEntreprise;
	private Boolean paye;
	private Boolean archive;
	private Multimedia multimedia ;
	private List<Match>matchVisites = new ArrayList<Match>();
	private List<Match> matchVisiteurs = new ArrayList<Match>();
	private List<Tournoi>tournois = new ArrayList<Tournoi>();

	
	
}
