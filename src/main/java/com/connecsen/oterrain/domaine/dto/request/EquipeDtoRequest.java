package com.connecsen.oterrain.domaine.dto.request;

import java.util.ArrayList;
import java.util.List;

import com.connecsen.oterrain.domaine.Match;
import com.connecsen.oterrain.domaine.Multimedia;
import com.connecsen.oterrain.domaine.Tournoi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data @NoArgsConstructor @AllArgsConstructor
public class EquipeDtoRequest {
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
