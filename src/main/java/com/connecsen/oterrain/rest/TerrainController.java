package com.connecsen.oterrain.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.connecsen.oterrain.domaine.Reservation;
import com.connecsen.oterrain.domaine.Reserver;
import com.connecsen.oterrain.domaine.dto.request.TerrainDtoRequest;
import com.connecsen.oterrain.domaine.dto.response.TerrainDtoResponse;
import com.connecsen.oterrain.service.ITerrainService;
import com.connecsen.oterrain.utils.Utility;

@RestController
public class TerrainController {
	private ITerrainService iTerrainService;
	Logger logger = LoggerFactory.getLogger(TerrainController.class);
	public TerrainController(ITerrainService iTerrainService) {
		super();
		this.iTerrainService = iTerrainService;
	}


	@PostMapping(Utility.ADD_TERRAIN)
	public TerrainDtoResponse ajouterTerrain(@PathVariable(value = "id") Long id, @RequestBody TerrainDtoRequest terrain) {
		TerrainDtoResponse terrainAdd =iTerrainService.createOrUpdateTerrain(id,terrain);
		String resultat = "echec";
		if(terrainAdd != null)
		{
			resultat = "success";
		}
logger.info(terrainAdd.getNom() +" terrain is created  "+"with : "+resultat);
		return terrainAdd;
	}
	@PostMapping(Utility.ADD_RESERVATION_TO_TERRAIN)
	public TerrainDtoResponse ajouterReservationTerrain(@PathVariable(value = "id") Long idTerrain, @RequestBody Reservation reservation) {
		TerrainDtoResponse terrainGot =iTerrainService.getTerrainById(idTerrain);
		TerrainDtoResponse terrainAdd =iTerrainService.addReservationToTerrain(idTerrain, reservation);
		String resultat = "echec";
		if(terrainGot.getReservations().size() < terrainAdd.getReservations().size())
		{
			resultat = "success";
		}
	logger.info(" terrain : "+terrainGot.getNom() +" tried to add reservation and size of reservation "+terrainGot.getReservations().size()
		+"with : "+resultat);
		return terrainAdd;
	}
	@PostMapping(Utility.UPDATE_TERRAIN)
	public TerrainDtoResponse getUpdateUser( @RequestBody TerrainDtoRequest user){
		return iTerrainService.createOrUpdateTerrain(user.getId(),user);
    }
	@GetMapping(Utility.GET_ALL_TERRAINS)
	public List<TerrainDtoResponse> getAllTerrain(){
		return iTerrainService.getAllTerrains();
    }
	@PostMapping(Utility.GET_ALL_RESERVATIONS_BY_ID_TERRAIN)
	public List<String> getTerrainAllReservations(@RequestBody Reserver reserver){
		return iTerrainService.getHoursBusyByTerrainAndMonthAndDay(reserver);
    }
	@GetMapping(Utility.GET_TERRAIN_BY_ID)
	public TerrainDtoResponse getTerrainById(@PathVariable(value = "id") Long userId){
		return iTerrainService.getTerrainById(userId);
    }
	@GetMapping(Utility.DELETE_TERRAIN_BY_ID)
	public boolean getDeleteTerrain(@PathVariable(value = "id") Long userId){
		TerrainDtoResponse terrainGot =iTerrainService.getTerrainById(userId);
		boolean resultat =iTerrainService.deleteTerrain(userId);
		logger.info(" terrain "+terrainGot.getNom()+"is deleted " +"resultat with : "+resultat);
		return resultat ;
    }
}
