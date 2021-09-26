package com.connecsen.oterrain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.connecsen.oterrain.domaine.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{

}
