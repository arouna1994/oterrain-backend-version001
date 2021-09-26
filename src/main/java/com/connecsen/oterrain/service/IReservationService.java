package com.connecsen.oterrain.service;

import java.util.List;

import com.connecsen.oterrain.domaine.Reservation;

public interface IReservationService {
	 //GESTION EQUIPES
	  public Reservation createOrUpdateReservation(Reservation reservationDtoRequest);
	  public  Reservation getReservationById(Long id);
	  public List<Reservation> getAllReservations();
	  public boolean deleteReservation(Long id); 
}
