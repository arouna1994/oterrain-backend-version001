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
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
@Entity 
public class Match implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String scoreVisiteur;
	private String scoreVisite;
	private String niveauTournoi;
	private String codeVideoEmded;
	private String annule;
	private boolean status;
	private boolean matchDejaJoue = false;
	private String repousse;
	private String nomTournoi;
	private Date dateDebutTournoi;
	private Date dateFinTournoi;
	@ManyToMany(cascade = CascadeType.PERSIST)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Equipe>equipeVisites = new ArrayList<Equipe>();
	@ManyToMany(cascade = CascadeType.PERSIST)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Equipe> equipeVisiteurs = new ArrayList<Equipe>();
	@OneToOne (targetEntity=Reservation.class, mappedBy="match",cascade = CascadeType.PERSIST)
	private Reservation reservation;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Terrain terrain;
	@ManyToOne(targetEntity=Tournoi.class)
	private Tournoi tournoi;
	private long idTournoi;
	public Match(String scoreVisiteur, String scoreVisite, String niveauTournoi, String codeVideoEmded, String annule,
			boolean matchDejaJoue,boolean status,String repousse,String nomTournoi,Date dateDebutTournoi, Date dateFinTournoi, List<Equipe> equipeVisites, List<Equipe> equipeVisiteurs, Reservation reservation,
			 Terrain terrain,  Tournoi tournoi,long idTournoi) {
		super();
		this.scoreVisiteur = scoreVisiteur;
		this.scoreVisite = scoreVisite;
		this.niveauTournoi = niveauTournoi;
		this.codeVideoEmded = codeVideoEmded;
		this.annule = annule;
		this.repousse = repousse;
		this.nomTournoi = nomTournoi;
		this.dateDebutTournoi = dateDebutTournoi;
		this.dateFinTournoi = dateFinTournoi;
		this.status = status;
		this.matchDejaJoue = matchDejaJoue;
		this.equipeVisites = equipeVisites;
		this.equipeVisiteurs = equipeVisiteurs;
		this.reservation = reservation;
		this.terrain = terrain;
		this.tournoi = tournoi;
		this.idTournoi = idTournoi;

	}

	public Match(Long id, String scoreVisiteur, String scoreVisite, String niveauTournoi, String codeVideoEmded,
			String annule,boolean matchDejaJoue,boolean status, String repousse,String nomTournoi,Date dateDebutTournoi, Date dateFinTournoi, List<Equipe> equipeVisites, List<Equipe> equipeVisiteurs,
			Reservation reservation, Terrain terrain, Tournoi tournoi,long idTournoi) {
		super();
		this.id = id;
		this.scoreVisiteur = scoreVisiteur;
		this.scoreVisite = scoreVisite;
		this.niveauTournoi = niveauTournoi;
		this.codeVideoEmded = codeVideoEmded;
		this.annule = annule;
		this.status = status;
		this.matchDejaJoue = matchDejaJoue;
		this.repousse = repousse;
		this.nomTournoi = nomTournoi;
		this.dateDebutTournoi = dateDebutTournoi;
		this.dateFinTournoi = dateFinTournoi;
		this.equipeVisites = equipeVisites;
		this.equipeVisiteurs = equipeVisiteurs;
		this.reservation = reservation;
		this.terrain = terrain;
		this.tournoi = tournoi;
		this.idTournoi = idTournoi;
	}

	public void setNomTournoi(String nomTournoi) {
		this.nomTournoi = nomTournoi;
	}

	
	public void setDateDebutTournoi(Date dateDebutTournoi) {
		this.dateDebutTournoi = dateDebutTournoi;
	}

	
	public void setDateFinTournoi(Date dateFinTournoi) {
		this.dateFinTournoi = dateFinTournoi;
	}

	public long getIdTournoi() {
		return idTournoi;
	}

	public void setIdTournoi(long idTournoi) {
		this.idTournoi = idTournoi;
	}

	public Match() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getScoreVisiteur() {
		return scoreVisiteur;
	}

	public void setScoreVisiteur(String scoreVisiteur) {
		this.scoreVisiteur = scoreVisiteur;
	}

	public String getScoreVisite() {
		return scoreVisite;
	}

	public void setScoreVisite(String scoreVisite) {
		this.scoreVisite = scoreVisite;
	}

	public String getNiveauTournoi() {
		return niveauTournoi;
	}

	public void setNiveauTournoi(String niveauTournoi) {
		this.niveauTournoi = niveauTournoi;
	}

	public String getCodeVideoEmded() {
		return codeVideoEmded;
	}

	public void setCodeVideoEmded(String codeVideoEmded) {
		this.codeVideoEmded = codeVideoEmded;
	}

	public String getAnnule() {
		return annule;
	}

	public void setAnnule(String annule) {
		this.annule = annule;
	}

	public String getRepousse() {
		return repousse;
	}

	public void setRepousse(String repousse) {
		this.repousse = repousse;
	}
	

	public List<Equipe> getEquipeVisites() {
		return equipeVisites;
	}

	public List<Equipe> getEquipeVisiteurs() {
		return equipeVisiteurs;
	}

	public void setEquipeVisites(List<Equipe> equipeVisites) {
		this.equipeVisites = equipeVisites;
	}
	

	public void setEquipeVisiteurs(List<Equipe> equipeVisiteurs) {
		this.equipeVisiteurs = equipeVisiteurs;
	}

	public boolean isMatchDejaJoue() {
		return matchDejaJoue;
	}

	public void setMatchDejaJoue(boolean matchDejaJoue) {
		this.matchDejaJoue = matchDejaJoue;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	

	public void setTerrain(Terrain terrain) {
		this.terrain = terrain;
	}
	
	public Tournoi getTournoi() {
		Tournoi test = new Tournoi();
		test.setNom(nomTournoi);;
		test.setDateDebut(dateDebutTournoi);
		test.setDateFin(dateFinTournoi);
		return test;
	}

	public void setTournoi(Tournoi tournoi) {
		this.tournoi = tournoi;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
