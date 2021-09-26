package com.connecsen.oterrain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.connecsen.oterrain.domaine.Fichier;

public interface FichierRepository extends JpaRepository<Fichier, Long>{

}
