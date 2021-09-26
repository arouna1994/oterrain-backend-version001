package com.connecsen.oterrain.domaine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
@Entity 
public class Terrain implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
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
	@OneToMany(targetEntity=ChoosePeriodicDay.class,cascade = CascadeType.REMOVE)
	@LazyCollection(LazyCollectionOption.FALSE)
	private  List<ChoosePeriodicDay> choosePeriodicDays = new ArrayList<ChoosePeriodicDay>();
	@ManyToMany(targetEntity=ListeHeureReserver.class,cascade = CascadeType.PERSIST)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<ListeHeureReserver> listeHeureReserver = new ArrayList<ListeHeureReserver>();
	@ManyToMany(targetEntity=Multimedia.class,cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Multimedia> multimedias = new ArrayList<Multimedia>();
	@OneToMany(targetEntity=Match.class, mappedBy="terrain",cascade = CascadeType.REMOVE)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Match> matchs = new ArrayList<Match>();
	@OneToMany(targetEntity=Reservation.class, mappedBy="terrain",cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Reservation> reservations = new ArrayList<Reservation>();
	@ManyToOne 
	private Utilisateur user;
	public Terrain(String nom, String adresse, String ville, String latitude, String longitude, String disponibilite,
			String description, Double prixHeure, Double prixDemiHeure,List<ChoosePeriodicDay> choosePeriodicDays,List<ListeHeureReserver> listeHeureReserver, List<Multimedia> multimedia, List<Match> matchs,
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
		this.listeHeureReserver = listeHeureReserver;
		this.multimedias = multimedia;
		this.matchs = matchs;
		this.reservations = reservations;
		this.user = user;
	}
	public Terrain(Long id, String nom, String adresse, String ville, String latitude, String longitude,
			String disponibilite, String description, Double prixHeure, Double prixDemiHeure,List<ChoosePeriodicDay> choosePeriodicDays,List<ListeHeureReserver> listeHeureReserver,
			List<Multimedia> multimedia, List<Match> matchs, List<Reservation> reservations, Utilisateur user) {
		super();
		this.id = id;
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
		this.multimedias = multimedia;
		this.listeHeureReserver = listeHeureReserver;
		this.matchs = matchs;
		this.reservations = reservations;
		this.user = user;
	}
	public Terrain() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getDisponibilite() {
		return disponibilite;
	}
	public void setDisponibilite(String disponibilite) {
		this.disponibilite = disponibilite;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrixHeure() {
		return prixHeure;
	}
	public void setPrixHeure(Double prixHeure) {
		this.prixHeure = prixHeure;
	}
	public Double getPrixDemiHeure() {
		return prixDemiHeure;
	}
	public void setPrixDemiHeure(Double prixDemiHeure) {
		this.prixDemiHeure = prixDemiHeure;
	}
	
	
	public List<ChoosePeriodicDay> getChoosePeriodicDays() {
		return choosePeriodicDays;
	}
	public void setChoosePeriodicDays(List<ChoosePeriodicDay> choosePeriodicDays) {
		this.choosePeriodicDays = choosePeriodicDays;
	}
	public List<Multimedia> getMultimedias() {
		return multimedias;
	}
	public void setMultimedias(List<Multimedia> multimedia) {
		this.multimedias = multimedia;
	}
	
	
	public void setMatchs(List<Match> matchs) {
		this.matchs = matchs;
	}
	public List<Reservation> getReservations() {
		return reservations;
	}
	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}
	
	public void setUser(Utilisateur user) {
		this.user = user;
	}
	public List<ListeHeureReserver> getListeHeureReserver() {
		return listeHeureReserver;
	}
	public void setListeHeureReserver(List<ListeHeureReserver> listeHeureReserver) {
		this.listeHeureReserver = listeHeureReserver;
	}
	
	
}
