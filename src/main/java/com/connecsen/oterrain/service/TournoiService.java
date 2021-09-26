package com.connecsen.oterrain.service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.connecsen.oterrain.domaine.Equipe;
import com.connecsen.oterrain.domaine.Match;
import com.connecsen.oterrain.domaine.Tournoi;
import com.connecsen.oterrain.domaine.dto.request.EquipeDtoRequest;
import com.connecsen.oterrain.domaine.dto.request.MatchDtoRequest;
import com.connecsen.oterrain.domaine.dto.request.TournoiDtoRequest;
import com.connecsen.oterrain.domaine.dto.response.MatchDtoResponse;
import com.connecsen.oterrain.domaine.dto.response.TournoiDtoResponse;
import com.connecsen.oterrain.repository.TournoiRepository;
import com.connecsen.oterrain.utils.Utility;
@Service
public class TournoiService implements ITournoiService{
private TournoiRepository tournoiRepository;
	public TournoiService(TournoiRepository tournoiRepository) {
		super();
		this.tournoiRepository = tournoiRepository;
	}

	@Override
	public TournoiDtoResponse createOrUpdateTournoi(TournoiDtoRequest tournoiDtoRequest) {
		Tournoi tournoi = Utility.tournoiDtoRequestConvertToTournoi(tournoiDtoRequest);
		TournoiDtoResponse tournoiDtoResponse = Utility.tournoiConvertToTournoiDtoResponse(tournoiRepository.save(tournoi));
		return tournoiDtoResponse;
	}

	@Override
	public TournoiDtoResponse getTournoiById(Long id) {
		Tournoi tournoi = tournoiRepository.findById(id).get();
		TournoiDtoResponse tournoiDtoResponse = Utility.tournoiConvertToTournoiDtoResponse(tournoiRepository.save(tournoi));
		return tournoiDtoResponse;
	}

	@Override
	public List<TournoiDtoResponse> getAllTournois() {
		List<Tournoi> tournois =tournoiRepository.findAll();
		 List<TournoiDtoResponse> tournoiDtoResponses = tournois.stream()
				 .map(utilisateur -> Utility.tournoiConvertToTournoiDtoResponse(utilisateur)).collect(Collectors.toList());
		return tournoiDtoResponses;
	}

	@Override
	public boolean deleteTournoi(Long id) {
		boolean resultat = false;
		Tournoi tournoi = tournoiRepository.findById(id).get();
		if(tournoi != null) {
			tournoiRepository.deleteById(id);
			resultat =true;
		}
		return resultat;
	}

	@Override
	public TournoiDtoResponse addEquipeToTournoi(Long id, EquipeDtoRequest equipeDtoRequest) {
		Tournoi tournoi = tournoiRepository.getById(id);
		Equipe equipe = Utility.equipeDtoRequestConvertToEquipe(equipeDtoRequest);
		tournoi.getEquipes().add(equipe);
		tournoi.setMultimedia(equipeDtoRequest.getMultimedia());
		Tournoi tournoiSave =tournoiRepository.save(tournoi);
		TournoiDtoResponse tournoiDtoResponse = Utility.tournoiConvertToTournoiDtoResponse(tournoiSave);
		return tournoiDtoResponse;
	}

	@Override
	public TournoiDtoResponse addMatchToTournoi(Long id, MatchDtoRequest matchDtoRequest) {
		Tournoi tournoi = tournoiRepository.getById(id);
		Match match = Utility.MatchDtoRequestConvertToMatch(matchDtoRequest);
		match.setTournoi(tournoi);
		tournoi.getMatchs().add(match);
		Tournoi tournoiSave =tournoiRepository.save(tournoi);
		TournoiDtoResponse tournoiDtoResponse = Utility.tournoiConvertToTournoiDtoResponse(tournoiSave);
		return tournoiDtoResponse;
	}

	@Override
	public List<TournoiDtoResponse> getAllTournoisByTypeTournoi(String typeTournoi) {
		List<Tournoi> tournois =tournoiRepository.findByTypeTournoiAndDateDebutGreaterThanEqual(typeTournoi,new Date());
		 List<TournoiDtoResponse> tournoiDtoResponses = tournois.stream()
				 .map(utilisateur -> Utility.tournoiConvertToTournoiDtoResponse(utilisateur)).collect(Collectors.toList());
		return tournoiDtoResponses;
	}

	@Override
	public List<TournoiDtoResponse> getAllTournoisByOrderByDateFinAsc() {
		List<Tournoi> tournoisReturned = new ArrayList<Tournoi>();
		List<Tournoi> tournois =tournoiRepository.findAllByOrderByDateFinDesc();
		tournoisReturned.add(tournois.get(0));
		tournoisReturned.add(tournois.get(1));
		 List<TournoiDtoResponse> tournoiDtoResponses = tournoisReturned.stream()
				 .map(utilisateur -> Utility.tournoiConvertToTournoiDtoResponse(utilisateur)).collect(Collectors.toList());
		return tournoiDtoResponses;
	}

	@Override
	public List<MatchDtoResponse> getAllTournoisDejaJouer(Long id) {
		Tournoi tournoi = tournoiRepository.getById(id);
		List<Match> matchJouer = new ArrayList<Match>();
		tournoi.getMatchs().forEach(match ->{
			if(match.isMatchDejaJoue()) {
				matchJouer.add(match);
			}
		});
		 List<MatchDtoResponse> tournoiDtoResponses = matchJouer.stream()
				 .map(match -> Utility.matchConvertToMatchDtoResponse(match)).collect(Collectors.toList());
		return tournoiDtoResponses;
	}

}
