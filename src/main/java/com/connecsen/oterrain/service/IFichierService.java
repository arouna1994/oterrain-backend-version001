package com.connecsen.oterrain.service;

import java.util.List;

import com.connecsen.oterrain.domaine.dto.request.FichierDtoRequest;
import com.connecsen.oterrain.domaine.dto.response.FichierDtoResponse;

public interface IFichierService {
	//GESTION FICHIER
	  public FichierDtoResponse createOrUpdateFichier( FichierDtoRequest fichierDtoRequest);
	  public  FichierDtoResponse getFichierById(Long id);
	  public List<FichierDtoResponse> getAllFichiers();
	  public boolean deleteFichier(Long id);
}
