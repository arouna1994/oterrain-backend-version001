package com.connecsen.oterrain.domaine;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity 
public class Reservation implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long idTerrain;
	private String nomTerrain;
	private double montant;
	private double montantTotal;
	private String statePayement;
	private String dateReservation;
	private String heure;
	@OneToOne 
	private Match match;
	@ManyToOne(targetEntity=Utilisateur.class)
	private Utilisateur user;
	@ManyToOne 
	private Terrain terrain;
	@OneToOne(cascade = CascadeType.ALL)
	private UserDoReservation userDoReservation;
	
	public Reservation(Long idUserDoReservation,Long idTerrain, String nomTerrain, double montant, double montantTotal, String statePayement,
			String dateReservation, String heure, Match match, Utilisateur user, Terrain terrain) {
		super();
		this.idTerrain = idTerrain;
		this.nomTerrain = nomTerrain;
		this.montant = montant;
		this.montantTotal = montantTotal;
		this.statePayement = statePayement;
		this.dateReservation = dateReservation;
		this.heure = heure;
		this.match = match;
		this.user = user;
		this.terrain = terrain;
	}
	
	public Reservation(Long id,Long idUserDoReservation, Long idTerrain, String nomTerrain, double montant, double montantTotal,
			String statePayement, String dateReservation, String heure, Match match, Utilisateur user,
			Terrain terrain) {
		super();
		this.id = id;
		this.idTerrain = idTerrain;
		this.nomTerrain = nomTerrain;
		this.montant = montant;
		this.montantTotal = montantTotal;
		this.statePayement = statePayement;
		this.dateReservation = dateReservation;
		this.heure = heure;
		this.match = match;
		this.user = user;
		this.terrain = terrain;
	}

	public Long getIdTerrain() {
		return idTerrain;
	}

	public void setIdTerrain(Long idTerrain) {
		this.idTerrain = idTerrain;
	}

	public String getNomTerrain() {
		return nomTerrain;
	}

	public void setNomTerrain(String nomTerrain) {
		this.nomTerrain = nomTerrain;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public double getMontantTotal() {
		return montantTotal;
	}

	public void setMontantTotal(double montantTotal) {
		this.montantTotal = montantTotal;
	}

	public Reservation() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getStatePayement() {
		return statePayement;
	}
	public void setStatePayement(String statePayement) {
		this.statePayement = statePayement;
	}
	public String getDateReservation() {
		return dateReservation;
	}
	public void setDateReservation(String dateReservation) {
		this.dateReservation = dateReservation;
	}
	
	public String getHeure() {
		return heure;
	}
	public void setHeure(String heure) {
		this.heure = heure;
	}
	
	public void setMatch(Match match) {
		this.match = match;
	}
	
	public void setUser(Utilisateur user) {
		this.user = user;
	}
	
	public void setTerrain(Terrain terrain) {
		this.terrain = terrain;
	}

	public UserDoReservation getUserDoReservation() {
		UserDoReservation userDoReservation = new UserDoReservation();
		userDoReservation.setAdresse(user.getAdresse());
		userDoReservation.setIdUser(user.getId());
		userDoReservation.setNom(user.getNom());
		userDoReservation.setPrenom(user.getPrenom());
		userDoReservation.setTelephone(user.getTelephone());
		return userDoReservation;
	}

	public void setUserDoReservation(UserDoReservation userDoReservation) {
		this.userDoReservation = userDoReservation;
	}
	

}
