package com.connecsen.oterrain.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.connecsen.oterrain.domaine.dto.request.FichierDtoRequest;
import com.connecsen.oterrain.domaine.dto.response.FichierDtoResponse;
import com.connecsen.oterrain.service.IFichierService;
import com.connecsen.oterrain.utils.Utility;

@RestController
public class FichierRestController {
	@Autowired
	private IFichierService iFichierService;
	
	@PostMapping(Utility.ADD_FICHIER)
	public FichierDtoResponse ajouterTournoi( @RequestBody FichierDtoRequest tournoi) {
		FichierDtoResponse tournoiAdd =iFichierService.createOrUpdateFichier(tournoi);
		return tournoiAdd;
	}
	@PostMapping(Utility.UPDATE_FICHIER)
	public FichierDtoResponse getUpdateUser( @RequestBody FichierDtoRequest user){
		return iFichierService.createOrUpdateFichier(user);
    }
	@GetMapping(Utility.GET_ALL_FICHIERS)
	public List<FichierDtoResponse> getAllTournoi(){
		return iFichierService.getAllFichiers();
    }
	@GetMapping(Utility.GET_FICHIER_BY_ID)
	public FichierDtoResponse getTournoiById(@PathVariable(value = "id") Long userId){
		return iFichierService.getFichierById(userId);
    }
	@GetMapping(Utility.DELETE_FICHIER_BY_ID)
	public boolean getDeleteTournoi(@PathVariable(value = "id") Long userId){
		return iFichierService.deleteFichier(userId);
    }
}
