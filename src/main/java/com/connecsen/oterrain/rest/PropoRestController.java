package com.connecsen.oterrain.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.connecsen.oterrain.domaine.dto.request.ProposDtoRequest;
import com.connecsen.oterrain.domaine.dto.response.ProposDtoResponse;
import com.connecsen.oterrain.service.IProposService;
import com.connecsen.oterrain.utils.Utility;

@RestController
public class PropoRestController {
	@Autowired
	private IProposService iProposService;
	
	@PostMapping(Utility.ADD_PROPOS)
	public ProposDtoResponse ajouterTournoi( @RequestBody ProposDtoRequest tournoi) {
		ProposDtoResponse tournoiAdd =iProposService.createOrUpdatePropos(tournoi);
		return tournoiAdd;
	}
	@PostMapping(Utility.UPDATE_PROPOS)
	public ProposDtoResponse getUpdateUser( @RequestBody ProposDtoRequest user){
		return iProposService.createOrUpdatePropos(user);
    }
	@GetMapping(Utility.GET_ALL_PROPOS)
	public List<ProposDtoResponse> getAllTournoi(){
		return iProposService.getAllPropos();
    }
	@GetMapping(Utility.GET_PROPOS_BY_ID)
	public ProposDtoResponse getTournoiById(@PathVariable(value = "id") Long userId){
		return iProposService.getProposById(userId);
    }
	@GetMapping(Utility.DELETE_PROPOS_BY_ID)
	public boolean getDeleteTournoi(@PathVariable(value = "id") Long userId){
		return iProposService.deletePropos(userId);
    }
}
