package com.connecsen.oterrain.domaine;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Entity @AllArgsConstructor @NoArgsConstructor 
public class Multimedia implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String file ;
	@OneToOne(targetEntity=HomeOne.class,mappedBy = "multimedia")
	private HomeOne homeone;
	@ManyToOne(targetEntity=Fichier.class)
	private Fichier fichier;
	@OneToOne(targetEntity=Publicite.class,mappedBy = "multimedia")
	private Publicite publicite;
	@OneToOne(targetEntity=Propos.class,mappedBy = "multimedia")
	private Propos propos;
	@OneToOne(targetEntity=Service.class,mappedBy = "multimedia")
	private Service service;
	@ManyToMany(targetEntity=Terrain.class,mappedBy = "multimedias") 
	private List<Terrain> terrain ;
	@OneToOne(targetEntity=Tournoi.class,mappedBy = "multimedia")
	private Tournoi tournoi;
	@OneToOne(targetEntity=Equipe.class,mappedBy = "multimedia")
	private Equipe equipe;
	
	public Multimedia(String file, HomeOne homeone, Fichier fichier, Publicite publicite, Propos propos,
			Service service, List<Terrain> terrain, Tournoi tournoi, Equipe equipe) {
		super();
		this.file = file;
		this.homeone = homeone;
		this.fichier = fichier;
		this.publicite = publicite;
		this.propos = propos;
		this.service = service;
		this.terrain = terrain;
		this.tournoi = tournoi;
		this.equipe = equipe;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setFile(String file) {
		this.file = file;
	}
	
	public void setHomeone(HomeOne homeone) {
		this.homeone = homeone;
	}
	public void setFichier(Fichier fichier) {
		this.fichier = fichier;
	}
	public void setPublicite(Publicite publicite) {
		this.publicite = publicite;
	}
	public void setPropos(Propos propos) {
		this.propos = propos;
	}
	public void setService(Service service) {
		this.service = service;
	}
	public void setTerrain(List<Terrain> terrain) {
		this.terrain = terrain;
	}
	public void setTournoi(Tournoi tournoi) {
		this.tournoi = tournoi;
	}
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	public String getFile() {
		return file;
	}
	
}
