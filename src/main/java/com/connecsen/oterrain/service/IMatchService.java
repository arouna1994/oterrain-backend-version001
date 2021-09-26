package com.connecsen.oterrain.service;

import java.util.List;

import com.connecsen.oterrain.domaine.dto.request.MatchDtoRequest;
import com.connecsen.oterrain.domaine.dto.response.MatchDtoResponse;

public interface IMatchService {
	//GESTION MatchS
	  public MatchDtoResponse createOrUpdateMatch( MatchDtoRequest tournoiDtoRequest);
	  public  MatchDtoResponse getMatchById(Long id);
	  public List<MatchDtoResponse> getAllMatchs();
	  public List<MatchDtoResponse> getAllMatchsDejaJoue(boolean matchDejaJoue);
	  public boolean deleteMatch(Long id); 
}
