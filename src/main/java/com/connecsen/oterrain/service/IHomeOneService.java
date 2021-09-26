package com.connecsen.oterrain.service;

import java.util.List;

import com.connecsen.oterrain.domaine.dto.request.HomeOneDtoRequest;
import com.connecsen.oterrain.domaine.dto.response.HomeOneDtoResponse;

public interface IHomeOneService {
	//GESTION EQUIPES
	  public HomeOneDtoResponse createOrUpdateHomeOne( HomeOneDtoRequest homeOneDtoRequest);
	  public  HomeOneDtoResponse getHomeOneById(Long id);
	  public List<HomeOneDtoResponse> getAllHomeOnes();
	  public boolean deleteHomeOne(Long id);
}
