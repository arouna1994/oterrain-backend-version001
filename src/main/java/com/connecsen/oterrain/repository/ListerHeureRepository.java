package com.connecsen.oterrain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.connecsen.oterrain.domaine.ListeHeureReserver;

public interface ListerHeureRepository extends JpaRepository<ListeHeureReserver, Long>{

}
