package com.connecsen.oterrain.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.connecsen.oterrain.domaine.dto.request.HomeOneDtoRequest;
import com.connecsen.oterrain.domaine.dto.response.HomeOneDtoResponse;
import com.connecsen.oterrain.service.IHomeOneService;
import com.connecsen.oterrain.utils.Utility;
@RestController
public class HomeOneRestController {
	@Autowired
	private IHomeOneService iHomeOneService;
	
	@PostMapping(Utility.ADD_HOMEONE)
	public HomeOneDtoResponse ajouterTournoi( @RequestBody HomeOneDtoRequest tournoi) {
		HomeOneDtoResponse tournoiAdd =iHomeOneService.createOrUpdateHomeOne(tournoi);
		return tournoiAdd;
	}
	@PostMapping(Utility.UPDATE_HOMEONE)
	public HomeOneDtoResponse getUpdateUser( @RequestBody HomeOneDtoRequest user){
		return iHomeOneService.createOrUpdateHomeOne(user);
    }
	@GetMapping(Utility.GET_ALL_HOMEONES)
	public List<HomeOneDtoResponse> getAllTournoi(){
		return iHomeOneService.getAllHomeOnes();
    }
	@GetMapping(Utility.GET_HOMEONE_BY_ID)
	public HomeOneDtoResponse getTournoiById(@PathVariable(value = "id") Long userId){
		return iHomeOneService.getHomeOneById(userId);
    }
	@GetMapping(Utility.DELETE_HOMEONE_BY_ID)
	public boolean getDeleteTournoi(@PathVariable(value = "id") Long userId){
		return iHomeOneService.deleteHomeOne(userId);
    }
}
