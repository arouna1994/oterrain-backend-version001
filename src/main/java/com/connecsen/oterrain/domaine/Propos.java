package com.connecsen.oterrain.domaine;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity 
public class Propos implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titre;
	private String urlVideo;
	@OneToOne(cascade =CascadeType.PERSIST)
	private Multimedia multimedia;
	private String text;
	private String telephone;
	private String email;
	private String adresse;
	public Propos() {
		super();
	}

	

	public Propos(String titre, String urlVideo, Multimedia multimedia, String text, String telephone, String email,
			String adresse) {
		super();
		this.titre = titre;
		this.urlVideo = urlVideo;
		this.multimedia = multimedia;
		this.text = text;
		this.telephone = telephone;
		this.email = email;
		this.adresse = adresse;
	}



	public Propos(Long id, String titre, String urlVideo, Multimedia multimedia, String text, String telephone,
			String email, String adresse) {
		super();
		this.id = id;
		this.titre = titre;
		this.urlVideo = urlVideo;
		this.multimedia = multimedia;
		this.text = text;
		this.telephone = telephone;
		this.email = email;
		this.adresse = adresse;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getTelephone() {
		return telephone;
	}



	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getAdresse() {
		return adresse;
	}



	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}



	public String getTitre() {
		return titre;
	}



	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getUrlVideo() {
		return urlVideo;
	}

	public void setUrlVideo(String urlVideo) {
		this.urlVideo = urlVideo;
	}

	public Multimedia getMultimedia() {
		return multimedia;
	}

	public void setMultimedia(Multimedia multimedia) {
		this.multimedia = multimedia;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	
}
