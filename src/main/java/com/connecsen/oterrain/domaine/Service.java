package com.connecsen.oterrain.domaine;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity 
public class Service implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titre;
	@OneToOne(cascade =CascadeType.PERSIST)
	private Multimedia multimedia;
	private String description;
	public Service() {
		super();
	}
	
	public Service(String titre, Multimedia multimedia, String description) {
		super();
		this.titre = titre;
		this.multimedia = multimedia;
		this.description = description;
		
	}

	public Service(Long id, String titre, Multimedia multimedia, String description) {
		super();
		this.id = id;
		this.titre = titre;
		this.multimedia = multimedia;
		this.description = description;
		
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
	public Multimedia getMultimedia() {
		return multimedia;
	}
	public void setMultimedia(Multimedia multimedia) {
		this.multimedia = multimedia;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
