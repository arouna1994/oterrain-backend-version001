package com.connecsen.oterrain.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.connecsen.oterrain.domaine.dto.request.PubDtoRequest;
import com.connecsen.oterrain.domaine.dto.response.PubDtoResponse;
import com.connecsen.oterrain.service.IPubService;
import com.connecsen.oterrain.utils.Utility;
@RestController
public class PubRestController {
	@Autowired
	private IPubService iPubService;
	
	@PostMapping(Utility.ADD_PUB)
	public PubDtoResponse ajouterTournoi( @RequestBody PubDtoRequest tournoi) {
		PubDtoResponse tournoiAdd =iPubService.createOrUpdatePub(tournoi);
		return tournoiAdd;
	}
	@PostMapping(Utility.UPDATE_PUB)
	public PubDtoResponse getUpdateUser( @RequestBody PubDtoRequest user){
		return iPubService.createOrUpdatePub(user);
    }
	@GetMapping(Utility.GET_ALL_PUBS)
	public List<PubDtoResponse> getAllTournoi(){
		return iPubService.getAllPubs();
    }
	@GetMapping(Utility.GET_PUB_BY_ID)
	public PubDtoResponse getTournoiById(@PathVariable(value = "id") Long userId){
		return iPubService.getPubById(userId);
    }
	@GetMapping(Utility.DELETE_PUB_BY_ID)
	public boolean getDeleteTournoi(@PathVariable(value = "id") Long userId){
		return iPubService.deletePub(userId);
    }
}
