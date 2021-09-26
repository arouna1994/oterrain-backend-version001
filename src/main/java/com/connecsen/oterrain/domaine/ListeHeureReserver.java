package com.connecsen.oterrain.domaine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class ListeHeureReserver implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ;
	private long indexJour;
	private long numeroJour;
	private long numeroMois;
	private String heure;
	@ManyToMany(targetEntity = Terrain.class, mappedBy="listeHeureReserver")
	private List<Terrain> terrain = new ArrayList<Terrain>();
	public ListeHeureReserver(long indexJour,long numeroJour, long numeroMois, String heure,  List<Terrain> terrain) {
		super();
		this.indexJour = indexJour;
		this.numeroJour = numeroJour;
		this.numeroMois = numeroMois;
		this.heure = heure;
		this.terrain = terrain;
	}
	public ListeHeureReserver(long id,long indexJour, long numeroJour, long numeroMois, String heure,  List<Terrain> terrain) {
		super();
		this.id = id;
		this.indexJour = indexJour;
		this.numeroJour = numeroJour;
		this.numeroMois = numeroMois;
		this.heure = heure;
		this.terrain = terrain;
	}
	public ListeHeureReserver() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public long getIndexJour() {
		return indexJour;
	}
	public void setIndexJour(long indexJour) {
		this.indexJour = indexJour;
	}
	public long getNumeroJour() {
		return numeroJour;
	}
	public void setNumeroJour(long numeroJour) {
		this.numeroJour = numeroJour;
	}
	public long getNumeroMois() {
		return numeroMois;
	}
	public void setNumeroMois(long numeroMois) {
		this.numeroMois = numeroMois;
	}
	public String getHeure() {
		return heure;
	}
	public void setHeure(String heure) {
		this.heure = heure;
	}
	
	public void setTerrain( List<Terrain> terrain) {
		this.terrain = terrain;
	}
	

}
