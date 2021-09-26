package com.connecsen.oterrain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.connecsen.oterrain.domaine.Terrain;

public interface TerrainRepository extends JpaRepository<Terrain, Long> {

}
