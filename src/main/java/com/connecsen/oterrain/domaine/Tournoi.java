package com.connecsen.oterrain.domaine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Entity @AllArgsConstructor @NoArgsConstructor
public class Tournoi implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String annee;
	private String description;
	private String typeTournoi;
	private String niveau ;
	private String numero ;
	private Double prixPartSrl;
	private Double prixPartSa;
	private Double prixPartEcole;
	private Double prixPme;
	private Date dateDebut;
	private Date dateFin;
	private Date dateDebutInscription;
	private Date dateFinInscription;
	@OneToMany(targetEntity=Match.class,cascade = {CascadeType.PERSIST,CascadeType.MERGE},mappedBy="tournoi")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Match> matchs = new ArrayList<Match>();
	@ManyToMany(targetEntity=Equipe.class, cascade = {CascadeType.PERSIST,CascadeType.MERGE} )
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Equipe> equipes = new ArrayList<Equipe>();
	@OneToOne(targetEntity=Multimedia.class,cascade = {CascadeType.PERSIST,CascadeType.MERGE} )
	private Multimedia multimedia ;
	public Tournoi(String nom, String annee, String description,String typeTournoi, String niveau, String numero, Double prixPartSrl,
			Double prixPartSa, Double prixPartEcole, Double prixPme, Date dateDebutInscription, Date dateFinInscription, Date dateDebut, Date dateFin, List<Match> matchs,
			List<Equipe> equipes, Multimedia multimedia) {
		super();
		this.nom = nom;
		this.annee = annee;
		this.description = description;
		this.typeTournoi = typeTournoi;
		this.niveau = niveau;
		this.numero = numero;
		this.prixPartSrl = prixPartSrl;
		this.prixPartSa = prixPartSa;
		this.prixPartEcole = prixPartEcole;
		this.prixPme = prixPme;
		this.dateDebutInscription = dateDebutInscription;
		this.dateFinInscription = dateFinInscription;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.matchs = matchs;
		this.equipes = equipes;
		this.multimedia = multimedia;
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
	public String getAnnee() {
		return annee;
	}
	public void setAnnee(String annee) {
		this.annee = annee;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTypeTournoi() {
		return typeTournoi;
	}
	public void setTypeTournoi(String typeTournoi) {
		this.typeTournoi = typeTournoi;
	}
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Double getPrixPartSrl() {
		return prixPartSrl;
	}
	public void setPrixPartSrl(Double prixPartSrl) {
		this.prixPartSrl = prixPartSrl;
	}
	public Double getPrixPartSa() {
		return prixPartSa;
	}
	public void setPrixPartSa(Double prixPartSa) {
		this.prixPartSa = prixPartSa;
	}
	public Double getPrixPartEcole() {
		return prixPartEcole;
	}
	public void setPrixPartEcole(Double prixPartEcole) {
		this.prixPartEcole = prixPartEcole;
	}
	public Double getPrixPme() {
		return prixPme;
	}
	public void setPrixPme(Double prixPme) {
		this.prixPme = prixPme;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public List<Match> getMatchs() {
		return matchs;
	}
	public void setMatchs(List<Match> matchs) {
		this.matchs = matchs;
	}
	public List<Equipe> getEquipes() {
		return equipes;
	}
	public void setEquipes(List<Equipe> equipes) {
		this.equipes = equipes;
	}
	public Multimedia getMultimedia() {
		return multimedia;
	}
	public void setMultimedia(Multimedia multimedia) {
		this.multimedia = multimedia;
	}
	public Date getDateDebutInscription() {
		return dateDebutInscription;
	}
	public void setDateDebutInscription(Date dateDebutInscription) {
		this.dateDebutInscription = dateDebutInscription;
	}
	public Date getDateFinInscription() {
		return dateFinInscription;
	}
	public void setDateFinInscription(Date dateFinInscription) {
		this.dateFinInscription = dateFinInscription;
	}
	
}
