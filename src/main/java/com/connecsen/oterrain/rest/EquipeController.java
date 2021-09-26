package com.connecsen.oterrain.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.connecsen.oterrain.domaine.dto.request.EquipeDtoRequest;
import com.connecsen.oterrain.domaine.dto.response.EquipeDtoResponse;
import com.connecsen.oterrain.service.IEquipeService;
import com.connecsen.oterrain.utils.Utility;


@RestController
public class EquipeController {
	@Autowired
	private IEquipeService iEquipeService;
	
	@PostMapping(Utility.ADD_EQUIPE)
	public EquipeDtoResponse ajouterTournoi( @RequestBody EquipeDtoRequest tournoi) {
		EquipeDtoResponse tournoiAdd =iEquipeService.createOrUpdateEquipe(tournoi);
		return tournoiAdd;
	}
	@PostMapping(Utility.UPDATE_EQUIPE)
	public EquipeDtoResponse getUpdateUser( @RequestBody EquipeDtoRequest user){
		return iEquipeService.createOrUpdateEquipe(user);
    }
	@GetMapping(Utility.GET_ALL_EQUIPES)
	public List<EquipeDtoResponse> getAllTournoi(){
		return iEquipeService.getAllEquipes();
    }
	@GetMapping(Utility.GET_EQUIPE_BY_ID)
	public EquipeDtoResponse getTournoiById(@PathVariable(value = "id") Long userId){
		return iEquipeService.getEquipeById(userId);
    }
	@GetMapping(Utility.DELETE_EQUIPE_BY_ID)
	public boolean getDeleteTournoi(@PathVariable(value = "id") Long userId){
		return iEquipeService.deleteEquipe(userId);
    }
}
