package com.connecsen.oterrain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.connecsen.oterrain.domaine.dto.request.EquipeDtoRequest;
import com.connecsen.oterrain.domaine.dto.response.EquipeDtoResponse;
@Service
public interface IEquipeService {
	   //GESTION EQUIPES
	  public EquipeDtoResponse createOrUpdateEquipe( EquipeDtoRequest tournoiDtoRequest);
	  public  EquipeDtoResponse getEquipeById(Long id);
	  public List<EquipeDtoResponse> getAllEquipes();
	  public boolean deleteEquipe(Long id); 
}
