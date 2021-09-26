package com.connecsen.oterrain.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.connecsen.oterrain.domaine.Tournoi;

public interface TournoiRepository extends JpaRepository<Tournoi, Long> {
  public List<Tournoi> findByTypeTournoiAndDateDebutGreaterThanEqual(String typeTournoi,Date date);
  public List<Tournoi> findAllByOrderByDateFinDesc();

}
