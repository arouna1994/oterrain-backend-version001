package com.connecsen.oterrain.service;

import java.util.List;

import com.connecsen.oterrain.domaine.dto.request.MultimediaDtoRequest;
import com.connecsen.oterrain.domaine.dto.response.MultimediaDtoResponse;

public interface IMultimediaService {
	//GESTION Multimedia
	  public MultimediaDtoResponse createOrUpdateMultimedia( MultimediaDtoRequest multimediaDtoRequest);
	  public  MultimediaDtoResponse getMultimediaById(Long id);
	  public List<MultimediaDtoResponse> getAllMultimedias();
	  public boolean deleteMultimedia(Long id); 
}
