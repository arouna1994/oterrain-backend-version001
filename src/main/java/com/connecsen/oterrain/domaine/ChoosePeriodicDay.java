package com.connecsen.oterrain.domaine;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class ChoosePeriodicDay {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String heure;
	private String days ;
    private Date dateDebut;
    private Date dateFin;
}
