package com.connecsen.oterrain.service;

import java.util.List;

import com.connecsen.oterrain.domaine.dto.request.PubDtoRequest;
import com.connecsen.oterrain.domaine.dto.response.PubDtoResponse;

public interface IPubService {
	//GESTION Pub
	  public PubDtoResponse createOrUpdatePub( PubDtoRequest PubDtoRequest);
	  public  PubDtoResponse getPubById(Long id);
	  public List<PubDtoResponse> getAllPubs();
	  public boolean deletePub(Long id);
}
