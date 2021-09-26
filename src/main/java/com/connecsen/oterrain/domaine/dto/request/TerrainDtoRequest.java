package com.connecsen.oterrain.domaine.dto.request;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.connecsen.oterrain.domaine.ChoosePeriodicDay;
import com.connecsen.oterrain.domaine.Match;
import com.connecsen.oterrain.domaine.Multimedia;
import com.connecsen.oterrain.domaine.Reservation;
import com.connecsen.oterrain.domaine.Utilisateur;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data @NoArgsConstructor @AllArgsConstructor
public class TerrainDtoRequest implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nom;
	private String adresse;
	private String ville;
	private String latitude;
	private String longitude;
	private String disponibilite;
	private String description;
	private Double prixHeure;
	private Double prixDemiHeure;
	private  List<ChoosePeriodicDay> choosePeriodicDays = new ArrayList<ChoosePeriodicDay>();
	private List<Multimedia> multimedias = new ArrayList<Multimedia>();
	private List<Match> matchs = new ArrayList<Match>();
	private List<Reservation> reservations = new ArrayList<Reservation>();
	private Utilisateur user;
	public TerrainDtoRequest(String nom, String adresse, String ville, String latitude, String longitude,
			String disponibilite, String description, Double prixHeure, Double prixDemiHeure,List<ChoosePeriodicDay> choosePeriodicDays,List<Multimedia> multimedias,List<Match> matchs,
			List<Reservation> reservations, Utilisateur user) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.ville = ville;
		this.latitude = latitude;
		this.longitude = longitude;
		this.disponibilite = disponibilite;
		this.description = description;
		this.prixHeure = prixHeure;
		this.prixDemiHeure = prixDemiHeure;
		this.choosePeriodicDays = choosePeriodicDays;
		this.multimedias = multimedias;
		this.matchs = matchs;
		this.reservations = reservations;
		this.user = user;
	}
	
}
