package com.connecsen.oterrain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.connecsen.oterrain.domaine.dto.request.EquipeDtoRequest;
import com.connecsen.oterrain.domaine.dto.request.MatchDtoRequest;
import com.connecsen.oterrain.domaine.dto.request.TournoiDtoRequest;
import com.connecsen.oterrain.domaine.dto.response.MatchDtoResponse;
import com.connecsen.oterrain.domaine.dto.response.TournoiDtoResponse;
@Service
public interface ITournoiService {
	   //GESTION TERRAINS
	  public TournoiDtoResponse createOrUpdateTournoi( TournoiDtoRequest tournoiDtoRequest);
	  public  TournoiDtoResponse getTournoiById(Long id);
	  public  TournoiDtoResponse addEquipeToTournoi(Long id,EquipeDtoRequest equipe);
	  public  TournoiDtoResponse addMatchToTournoi(Long id,MatchDtoRequest match);
	  public List<TournoiDtoResponse> getAllTournoisByTypeTournoi(String typeTournoi);
	  public List<TournoiDtoResponse> getAllTournoisByOrderByDateFinAsc();
	  public List<TournoiDtoResponse> getAllTournois();
	  public List<MatchDtoResponse> getAllTournoisDejaJouer(Long id);
	  public boolean deleteTournoi(Long id); 
}
