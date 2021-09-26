package com.connecsen.oterrain.service;

import java.util.List;

import com.connecsen.oterrain.domaine.dto.request.ProposDtoRequest;
import com.connecsen.oterrain.domaine.dto.response.ProposDtoResponse;

public interface IProposService {
	//GESTION PROPOS
	  public ProposDtoResponse createOrUpdatePropos( ProposDtoRequest proposDtoRequest);
	  public  ProposDtoResponse getProposById(Long id);
	  public List<ProposDtoResponse> getAllPropos();
	  public boolean deletePropos(Long id);
}
