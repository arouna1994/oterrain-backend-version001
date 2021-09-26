package com.connecsen.oterrain.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.connecsen.oterrain.domaine.Equipe;
import com.connecsen.oterrain.domaine.dto.request.EquipeDtoRequest;
import com.connecsen.oterrain.domaine.dto.response.EquipeDtoResponse;
import com.connecsen.oterrain.repository.EquipeRepository;
import com.connecsen.oterrain.utils.Utility;

@Service
public class EquipeService implements IEquipeService {
	
	@Autowired
	private EquipeRepository equipeRepository;
	@Override
	public EquipeDtoResponse createOrUpdateEquipe(EquipeDtoRequest tournoiDtoRequest) {
		Equipe tournoi = Utility.equipeDtoRequestConvertToEquipe(tournoiDtoRequest);
		EquipeDtoResponse tournoiDtoResponse = Utility.equipeConvertToEquipeDtoResponse(equipeRepository.save(tournoi));
		return tournoiDtoResponse;
	}

	@Override
	public EquipeDtoResponse getEquipeById(Long id) {
		
		Equipe tournoi = equipeRepository.findById(id).get();
		EquipeDtoResponse tournoiDtoResponse = Utility.equipeConvertToEquipeDtoResponse(equipeRepository.save(tournoi));
		return tournoiDtoResponse;
	}

	@Override
	public List<EquipeDtoResponse> getAllEquipes() {
		List<Equipe> tournois =equipeRepository.findAll();
		 List<EquipeDtoResponse> tournoiDtoResponses = tournois.stream()
				 .map(utilisateur -> Utility.equipeConvertToEquipeDtoResponse(utilisateur)).collect(Collectors.toList());
		return tournoiDtoResponses;
	}

	@Override
	public boolean deleteEquipe(Long id) {
		boolean resultat = false;
		Equipe tournoi = equipeRepository.findById(id).get();
		if(tournoi != null) {
			equipeRepository.deleteById(id);
			resultat =true;
		}
		return resultat;
	
	}

}
