package com.connecsen.oterrain.domaine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity 
public class Fichier implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToMany(cascade =CascadeType.PERSIST,mappedBy = "fichier")
	private List<Multimedia> multimedias = new ArrayList<Multimedia>();;
	private String description;
	private String typeFichier;
	
	public Fichier() {
		super();
	}
	public Fichier(List<Multimedia> multimedias, String description, String typeFichier) {
		super();
		this.multimedias = multimedias;
		this.description = description;
		this.typeFichier = typeFichier;
	}
	public Fichier(Long id, List<Multimedia> multimedias, String description, String typeFichier) {
		super();
		this.id = id;
		this.multimedias = multimedias;
		this.description = description;
		this.typeFichier = typeFichier;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Multimedia>  getMultimedias() {
		return multimedias;
	}
	public void setMultimedias(List<Multimedia> multimedias ) {
		this.multimedias = multimedias;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTypeFichier() {
		return typeFichier;
	}
	public void setTypeFichier(String typeFichier) {
		this.typeFichier = typeFichier;
	}
}
