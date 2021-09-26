package com.connecsen.oterrain.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.connecsen.oterrain.domaine.dto.request.MatchDtoRequest;
import com.connecsen.oterrain.domaine.dto.response.MatchDtoResponse;
import com.connecsen.oterrain.service.IMatchService;
import com.connecsen.oterrain.utils.Utility;
@RestController
public class MatchController {
	@Autowired
	private IMatchService iMatchService;
	
	@PostMapping(Utility.ADD_MATCH)
	public MatchDtoResponse ajouterTournoi( @RequestBody MatchDtoRequest tournoi) {
		MatchDtoResponse tournoiAdd =iMatchService.createOrUpdateMatch(tournoi);
		return tournoiAdd;
	}
	@PostMapping(Utility.UPDATE_MATCH)
	public MatchDtoResponse getUpdateUser( @RequestBody MatchDtoRequest user){
		return iMatchService.createOrUpdateMatch(user);
    }
	@GetMapping(Utility.GET_ALL_MATCHS)
	public List<MatchDtoResponse> getAllTournoi(){
		return iMatchService.getAllMatchs();
    }
	@GetMapping(Utility.GET_ALL_MATCH_JOUER_OR_NO)
	public List<MatchDtoResponse> getAllMAtchJouerOuPas(@PathVariable(value = "option") boolean option){
		return iMatchService.getAllMatchsDejaJoue(option);
    }
	@GetMapping(Utility.GET_MATCH_BY_ID)
	public MatchDtoResponse getTournoiById(@PathVariable(value = "id") Long userId){
		return iMatchService.getMatchById(userId);
    }
	@GetMapping(Utility.DELETE_MATCH_BY_ID)
	public boolean getDeleteTournoi(@PathVariable(value = "id") Long userId){
		return iMatchService.deleteMatch(userId);
    }
}
