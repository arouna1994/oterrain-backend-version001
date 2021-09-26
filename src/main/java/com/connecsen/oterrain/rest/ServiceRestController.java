package com.connecsen.oterrain.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.connecsen.oterrain.domaine.dto.request.ServiceDtoRequest;
import com.connecsen.oterrain.domaine.dto.response.ServiceDtoResponse;
import com.connecsen.oterrain.service.IFrontService;
import com.connecsen.oterrain.utils.Utility;

@RestController
public class ServiceRestController {
	@Autowired
	private IFrontService iServiceService;
	
	@PostMapping(Utility.ADD_SERVICE)
	public ServiceDtoResponse ajouterTournoi( @RequestBody ServiceDtoRequest tournoi) {
		ServiceDtoResponse tournoiAdd =iServiceService.createOrUpdateService(tournoi);
		return tournoiAdd;
	}
	@PostMapping(Utility.UPDATE_SERVICE)
	public ServiceDtoResponse getUpdateUser( @RequestBody ServiceDtoRequest user){
		return iServiceService.createOrUpdateService(user);
    }
	@GetMapping(Utility.GET_ALL_SERVICES)
	public List<ServiceDtoResponse> getAllTournoi(){
		return iServiceService.getAllServices();
    }
	@GetMapping(Utility.GET_SERVICE_BY_ID)
	public ServiceDtoResponse getTournoiById(@PathVariable(value = "id") Long userId){
		return iServiceService.getServiceById(userId);
    }
	@GetMapping(Utility.DELETE_SERVICE_BY_ID)
	public boolean getDeleteTournoi(@PathVariable(value = "id") Long userId){
		return iServiceService.deleteService(userId);
    }
}
