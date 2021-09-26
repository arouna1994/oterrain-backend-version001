package com.connecsen.oterrain.domaine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import com.connecsen.oterrain.utils.Utility;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
@Entity
public class Utilisateur implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(unique = true)
	private String username;
	private String prenom;
	private String nom;
	private String adresse;
	private String typeId;
	private String numeroId;
	private String naissance;
	private boolean userDelete =false;
	@Column(unique = true)
	private String email;
	private String telephone;
	@Transient
	private String monToken;
	private String password;
	@Column(name = "reset_password_token")
    private String resetPasswordToken;
	@ManyToOne 
	private Role roles ; 
	@OneToMany(targetEntity=Terrain.class, mappedBy="user")
	private List<Terrain> terrains = new ArrayList<Terrain>();
	@OneToMany(targetEntity=Reservation.class, mappedBy = "user")
	private List<Reservation> reservations = new ArrayList<Reservation>();
	
	public Utilisateur() {
		super();
	}

	public Utilisateur(Long id, String username,String nom, String prenom, String adresse, String typeId, String numeroId,
			String naissance,boolean userDelete, String email, String telephone, String password,Role roles,
			List<Terrain> terrains, List<Reservation> reservations) {
		super();
		this.id = id;
		this.username = username;
		this.prenom = prenom;
		this.nom = nom;
		this.adresse = adresse;
		this.typeId = typeId;
		this.numeroId = numeroId;
		this.userDelete = userDelete;
		this.naissance = naissance;
		this.email = email;
		this.telephone = telephone;
		this.password = password;
		this.roles = roles;
		this.terrains = terrains;
		this.reservations = reservations;
	}

	public Utilisateur(String username, String prenom,String nom, String adresse, String typeId, String numeroId, String naissance,
			boolean userDelete,String email, String telephone, String password, Role roles, List<Terrain> terrains,
			List<Reservation> reservations) {
		super();
		this.username = username;
		this.prenom = prenom;
		this.nom = nom;
		this.adresse = adresse;
		this.typeId = typeId;
		this.numeroId = numeroId;
		this.userDelete = userDelete;
		this.naissance = naissance;
		this.email = email;
		this.telephone = telephone;
		this.password = password;
		this.roles = roles;
		this.terrains = terrains;
		this.reservations = reservations;
	}

	public boolean isUserDelete() {
		return userDelete;
	}

	public void setUserDelete(boolean userDelete) {
		this.userDelete = userDelete;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getNumeroId() {
		return numeroId;
	}

	public void setNumeroId(String numeroId) {
		this.numeroId = numeroId;
	}

	public String getNaissance() {
		return naissance;
	}

	public void setNaissance(String naissance) {
		this.naissance = naissance;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
  // @JsonIgnore
	public String getPassword() {
		return password;
	}
    @JsonSetter
	public void setPassword(String password) {
		this.password = password;
	}

	public Role  getRoles() {
		return roles;
	}

	public void setRoles(Role roles) {
		this.roles = roles;
	}
	

	public List<Terrain> getTerrains() {
		return terrains;
	}

	public void setTerrains(List<Terrain> terrains) {
		this.terrains = terrains;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}
	 @JsonIgnore
	public String getResetPasswordToken() {
		return resetPasswordToken;
	}
	 @JsonSetter
	public void setResetPasswordToken(String resetPasswordToken) {
		this.resetPasswordToken = resetPasswordToken;
	}

	public String getMonToken() {
		return Utility.TOKEN_PREFIX+monToken ;
	}

	public void setMonToken(String monToken) {
		this.monToken = monToken;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	

}
