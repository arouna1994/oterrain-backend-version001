package com.connecsen.oterrain.service;

import java.util.List;

import com.connecsen.oterrain.domaine.dto.request.ServiceDtoRequest;
import com.connecsen.oterrain.domaine.dto.response.ServiceDtoResponse;

public interface IFrontService {
	//GESTION SERVICE
	  public ServiceDtoResponse createOrUpdateService( ServiceDtoRequest serviceDtoRequest);
	  public  ServiceDtoResponse getServiceById(Long id);
	  public List<ServiceDtoResponse> getAllServices();
	  public boolean deleteService(Long id);
}
