package com.connecsen.oterrain.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.connecsen.oterrain.domaine.dto.request.MultimediaDtoRequest;
import com.connecsen.oterrain.domaine.dto.response.MultimediaDtoResponse;
import com.connecsen.oterrain.service.IMultimediaService;
import com.connecsen.oterrain.utils.Utility;

@RestController
public class MultimediaRestController {
	@Autowired
	private IMultimediaService iMultimediaService;
	
	@PostMapping(Utility.ADD_MULTIMEDIA)
	public MultimediaDtoResponse ajouterTournoi( @RequestBody MultimediaDtoRequest tournoi) {
		MultimediaDtoResponse tournoiAdd =iMultimediaService.createOrUpdateMultimedia(tournoi);
		return tournoiAdd;
	}
	@PostMapping(Utility.UPDATE_MULTIMEDIA)
	public MultimediaDtoResponse getUpdateUser( @RequestBody MultimediaDtoRequest user){
		return iMultimediaService.createOrUpdateMultimedia(user);
    }
	@GetMapping(Utility.GET_ALL_MULTIMEDIAS)
	public List<MultimediaDtoResponse> getAllTournoi(){
		return iMultimediaService.getAllMultimedias();
    }
	@GetMapping(Utility.GET_MULTIMEDIA_BY_ID)
	public MultimediaDtoResponse getTournoiById(@PathVariable(value = "id") Long userId){
		return iMultimediaService.getMultimediaById(userId);
    }
	@GetMapping(Utility.DELETE_MULTIMEDIA_BY_ID)
	public boolean getDeleteTournoi(@PathVariable(value = "id") Long userId){
		return iMultimediaService.deleteMultimedia(userId);
    }
}
