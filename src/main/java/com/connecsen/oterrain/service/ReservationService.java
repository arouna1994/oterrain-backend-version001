package com.connecsen.oterrain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.connecsen.oterrain.domaine.Reservation;
import com.connecsen.oterrain.repository.ReservationRepository;
@Service
public class ReservationService implements IReservationService{

	@Autowired
	private ReservationRepository reservationRepository;
	@Override
	public Reservation createOrUpdateReservation(Reservation tournoiDtoRequest) {
		Reservation tournoiDtoResponse = reservationRepository.save(tournoiDtoRequest);
		return tournoiDtoResponse;
	}

	@Override
	public Reservation getReservationById(Long id) {
		
		Reservation tournoi = reservationRepository.findById(id).get();
		Reservation tournoiDtoResponse = reservationRepository.save(tournoi);
		return tournoiDtoResponse;
	}

	@Override
	public List<Reservation> getAllReservations() {
		return reservationRepository.findAll();
	}

	@Override
	public boolean deleteReservation(Long id) {
		boolean resultat = false;
		Reservation tournoi = reservationRepository.findById(id).get();
		if(tournoi != null) {
			reservationRepository.deleteById(id);
			resultat =true;
		}
		return resultat;
	
	}
}
