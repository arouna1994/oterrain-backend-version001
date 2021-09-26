package com.connecsen.oterrain.domaine;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity 
public class HomeOne implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titre;
	private String description;
	@OneToOne(cascade =CascadeType.ALL,fetch = FetchType.EAGER)
	private Multimedia multimedia;
	private String bouton;
	
	
	
	public HomeOne() {
		super();
	}
	
	public HomeOne(String titre, String description, Multimedia multimedia, String bouton) {
		super();
		this.titre = titre;
		this.description = description;
		this.multimedia = multimedia;
		this.bouton = bouton;
		
		
	}

	public HomeOne(Long id, String titre, String description, Multimedia multimedia, String bouton) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.multimedia = multimedia;
		this.bouton = bouton;
		
		
	}

	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Multimedia getMultimedia() {
		return multimedia;
	}
	public void setMultimedia(Multimedia multimedia) {
		this.multimedia = multimedia;
	}
	public String getBouton() {
		return bouton;
	}
	public void setBouton(String bouton) {
		this.bouton = bouton;
	}
}
