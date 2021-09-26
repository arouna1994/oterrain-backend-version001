package com.connecsen.oterrain.domaine;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class UserDoReservation implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long idUser;
	private String nom;
	private String prenom;
	private String adresse;
	private String telephone;
	public UserDoReservation(long idUser, String nom, String prenom, String adresse,String telephone) {
		super();
		this.idUser = idUser;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = telephone;
	}
	

}
