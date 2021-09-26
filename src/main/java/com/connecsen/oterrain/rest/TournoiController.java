package com.connecsen.oterrain.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.connecsen.oterrain.domaine.dto.request.EquipeDtoRequest;
import com.connecsen.oterrain.domaine.dto.request.MatchDtoRequest;
import com.connecsen.oterrain.domaine.dto.request.TournoiDtoRequest;
import com.connecsen.oterrain.domaine.dto.response.MatchDtoResponse;
import com.connecsen.oterrain.domaine.dto.response.TournoiDtoResponse;
import com.connecsen.oterrain.service.ITournoiService;
import com.connecsen.oterrain.utils.Utility;

@RestController
public class TournoiController {
	private ITournoiService iTournoiService;
	Logger logger = LoggerFactory.getLogger(TournoiController.class);

	public TournoiController(ITournoiService iTournoiService) {
		super();
		this.iTournoiService = iTournoiService;
	}
	@PostMapping(Utility.ADD_EQUIPE_TO_TOURNOI)
	public TournoiDtoResponse ajouterEquipeATournoi(@PathVariable(value = "id") Long tournoiId, @RequestBody EquipeDtoRequest equipe) {
		TournoiDtoResponse tournoiGot =iTournoiService.getTournoiById(tournoiId);
		TournoiDtoResponse tournoiAdd =iTournoiService.addEquipeToTournoi(tournoiId, equipe);
		String resultat ="echec";
		if(tournoiGot.getEquipes().size() < tournoiAdd.getEquipes().size())
		{
			resultat = "success";
		}
	logger.info(" equipe : "+equipe.getNomEquipe() +" tried to subscribe to tournoi : "+tournoiAdd.getNom()+"type de tournoi : "+tournoiAdd.getTypeTournoi()
		+" with : "+resultat);
		return tournoiAdd;
	}
	@PostMapping(Utility.ADD_MATCH_TO_TOURNOI)
	public TournoiDtoResponse ajouterMatchATournoi(@PathVariable(value = "id") Long tournoiId, @RequestBody MatchDtoRequest match) {
		TournoiDtoResponse tournoiGot =iTournoiService.getTournoiById(tournoiId);
		match.setNomTournoi(tournoiGot.getNom());
		match.setDateDebutTournoi(tournoiGot.getDateDebut());
		match.setDateFinTournoi(tournoiGot.getDateFin());
		TournoiDtoResponse tournoiAdd =iTournoiService.addMatchToTournoi(tournoiId, match);
		String resultat ="echec";
		if(tournoiGot.getMatchs().size() < tournoiAdd.getMatchs().size())
		{
			resultat = "success";
		}
	logger.info(" tried to add  match to tournoi : "+tournoiAdd.getNom()+"type de tournoi : "+tournoiAdd.getTypeTournoi()
		+" resultat with  : "+resultat);
		return tournoiAdd;
	}
	@PostMapping(Utility.ADD_TOURNOI)
	public TournoiDtoResponse ajouterTournoi( @RequestBody TournoiDtoRequest tournoi) {
		TournoiDtoResponse tournoiAdd =iTournoiService.createOrUpdateTournoi(tournoi);
		String resultat ="echec";
		if(tournoiAdd != null)
		{
			resultat = "success";
		}
	logger.info(" tournoi created : "+tournoiAdd.getNom()+"type de tournoi : "+tournoiAdd.getTypeTournoi() 
		+"resultat with : "+resultat);
		return tournoiAdd;
	}
	@PostMapping(Utility.UPDATE_TOURNOI)
	public TournoiDtoResponse getUpdateUser( @RequestBody TournoiDtoRequest user){
		return iTournoiService.createOrUpdateTournoi(user);
    }
	@GetMapping(Utility.GET_ALL_TOURNOIS)
	public List<TournoiDtoResponse> getAllTournoi(){
		return iTournoiService.getAllTournois();
    }
	@GetMapping(Utility.GET_ALL_TOURNOIS_DAY)
	public List<TournoiDtoResponse> getAllTournoiByDays(){
		return iTournoiService.getAllTournoisByOrderByDateFinAsc();
    }
	@GetMapping(Utility.GET_TOURNOI_BY_ID)
	public TournoiDtoResponse getTournoiById(@PathVariable(value = "id") Long userId){
		return iTournoiService.getTournoiById(userId);
    }
	@GetMapping(Utility.GET_ALL_MATCH_DEJA_JOUER_TOURNOIS_BY_ID)
	public List<MatchDtoResponse> getAllMatchDejaJouerTournoiById(@PathVariable(value = "id") Long userId){
		return iTournoiService.getAllTournoisDejaJouer(userId);
    }
	@GetMapping(Utility.GET_TOURNOI_BY_TYPETOURNOI)
	public List<TournoiDtoResponse> getTournoiByTypeTournoi(@PathVariable(value = "typeTournoi") String  typeTournoi){
		return iTournoiService.getAllTournoisByTypeTournoi(typeTournoi);
    }
	@GetMapping(Utility.DELETE_TOURNOI_BY_ID)
	public boolean getDeleteTournoi(@PathVariable(value = "id") Long userId){
		TournoiDtoResponse tournoiGot =iTournoiService.getTournoiById(userId);
		boolean resultat =iTournoiService.deleteTournoi(userId);
		logger.info(" tournoi "+tournoiGot.getNom()+"type de tournoi : "+tournoiGot.getTypeTournoi()
		+"is deleted " +"resultat with : "+resultat);
		return resultat ;
    }
}
