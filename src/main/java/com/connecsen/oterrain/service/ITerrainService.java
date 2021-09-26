package com.connecsen.oterrain.service;

import java.util.List;

import com.connecsen.oterrain.domaine.Reservation;
import com.connecsen.oterrain.domaine.Reserver;
import com.connecsen.oterrain.domaine.dto.request.TerrainDtoRequest;
import com.connecsen.oterrain.domaine.dto.response.TerrainDtoResponse;

public interface ITerrainService {
	      //GESTION TERRAINS
		  public TerrainDtoResponse createOrUpdateTerrain(long id, TerrainDtoRequest terrainDtoRequest);
		  public TerrainDtoResponse addReservationToTerrain( long idTerrain,Reservation reservationDtoRequest);
		  public  TerrainDtoResponse getTerrainById(Long id);
		  public List<TerrainDtoResponse> getAllTerrains();
		  public boolean deleteTerrain(Long id); 
		  public List<String> getHoursBusyByTerrainAndMonthAndDay(Reserver reserver);
		 
}
