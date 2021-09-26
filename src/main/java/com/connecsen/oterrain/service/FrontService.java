package com.connecsen.oterrain.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.connecsen.oterrain.domaine.Service;
import com.connecsen.oterrain.domaine.dto.request.ServiceDtoRequest;
import com.connecsen.oterrain.domaine.dto.response.ServiceDtoResponse;
import com.connecsen.oterrain.repository.ServiceRepository;
import com.connecsen.oterrain.utils.Utility;

@org.springframework.stereotype.Service
public class FrontService implements IFrontService{
	@Autowired
	private ServiceRepository serviceRepository;
	@Override
	public ServiceDtoResponse createOrUpdateService(ServiceDtoRequest tournoiDtoRequest) {
		Service tournoi = Utility.serviceDtoRequestConvertToService(tournoiDtoRequest);
		ServiceDtoResponse tournoiDtoResponse = Utility.serviceConvertToServiceDtoResponse(serviceRepository.save(tournoi));
		return tournoiDtoResponse;
	}

	@Override
	public ServiceDtoResponse getServiceById(Long id) {
		
		Service tournoi = serviceRepository.findById(id).get();
		ServiceDtoResponse tournoiDtoResponse = Utility.serviceConvertToServiceDtoResponse(serviceRepository.save(tournoi));
		return tournoiDtoResponse;
	}

	@Override
	public List<ServiceDtoResponse> getAllServices() {
		List<Service> tournois =serviceRepository.findAll();
		 List<ServiceDtoResponse> tournoiDtoResponses = tournois.stream()
				 .map(utilisateur -> Utility.serviceConvertToServiceDtoResponse(utilisateur)).collect(Collectors.toList());
		return tournoiDtoResponses;
	}

	@Override
	public boolean deleteService(Long id) {
		boolean resultat = false;
		Service tournoi = serviceRepository.findById(id).get();
		if(tournoi != null) {
			serviceRepository.deleteById(id);
			resultat =true;
		}
		return resultat;
	
	}

}
