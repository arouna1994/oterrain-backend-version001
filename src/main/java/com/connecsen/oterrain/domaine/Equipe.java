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
import javax.persistence.OneToOne;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Entity  @AllArgsConstructor @NoArgsConstructor
public class Equipe implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
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
	@OneToOne(targetEntity=Multimedia.class,cascade = {CascadeType.REMOVE,CascadeType.PERSIST} )
	private Multimedia multimedia ;
	@ManyToMany(targetEntity=Match.class, mappedBy="equipeVisites",cascade = {CascadeType.REMOVE,CascadeType.PERSIST})
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Match>matchVisites = new ArrayList<Match>();
	@ManyToMany(targetEntity=Match.class, mappedBy="equipeVisiteurs",cascade = {CascadeType.REMOVE,CascadeType.PERSIST})
	@LazyCollection(LazyCollectionOption.FALSE)
	private  List<Match> matchVisiteurs = new ArrayList<Match>();
	@ManyToMany(targetEntity=Tournoi.class,mappedBy="equipes")
	@LazyCollection(LazyCollectionOption.FALSE)
	private  List<Tournoi>tournois = new ArrayList<Tournoi>();
	public Equipe(String nomEquipe,String raisonSociale,String nomEcole,String numeroTelephone,String ville,String email,String niveau, String nomEntreprise, String typeEntreprise, Boolean paye, Boolean archive,
			Multimedia multimedia, List<Match> matchVisites, List<Match> matchVisiteurs, List<Tournoi> tournois) {
		super();
		this.nomEquipe = nomEquipe;
		this.raisonSociale = raisonSociale;
		this.nomEcole = nomEcole;
		this.numeroTelephone = numeroTelephone;
		this.ville = ville;
		this.email = email;
		this.niveau = niveau;
		this.nomEntreprise = nomEntreprise;
		this.typeEntreprise = typeEntreprise;
		this.paye = paye;
		this.archive = archive;
		this.multimedia = multimedia;
		this.matchVisites = matchVisites;
		this.matchVisiteurs = matchVisiteurs;
		this.tournois = tournois;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomEquipe() {
		return nomEquipe;
	}
	public void setNomEquipe(String nomEquipe) {
		this.nomEquipe = nomEquipe;
	}
	public String getNomEntreprise() {
		return nomEntreprise;
	}
	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}
	public String getTypeEntreprise() {
		return typeEntreprise;
	}
	public void setTypeEntreprise(String typeEntreprise) {
		this.typeEntreprise = typeEntreprise;
	}
	public Boolean getPaye() {
		return paye;
	}
	public void setPaye(Boolean paye) {
		this.paye = paye;
	}
	public Boolean getArchive() {
		return archive;
	}
	public void setArchive(Boolean archive) {
		this.archive = archive;
	}
	
	
	public void setMatchVisites(List<Match> matchVisites) {
		this.matchVisites = matchVisites;
	}
	
	public void setMatchVisiteurs(List<Match> matchVisiteurs) {
		this.matchVisiteurs = matchVisiteurs;
	}
	
	public void setTournois(List<Tournoi> tournois) {
		this.tournois = tournois;
	}

	public Multimedia getMultimedia() {
		return multimedia;
	}

	public void setMultimedia(Multimedia multimedia) {
		this.multimedia = multimedia;
	}


	public String getNomEcole() {
		return nomEcole;
	}


	public void setNomEcole(String nomEcole) {
		this.nomEcole = nomEcole;
	}


	public String getNumeroTelephone() {
		return numeroTelephone;
	}


	public void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNiveau() {
		return niveau;
	}


	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}


	public String getRaisonSociale() {
		return raisonSociale;
	}


	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}
	
	
}
