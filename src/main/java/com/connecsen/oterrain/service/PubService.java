package com.connecsen.oterrain.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.connecsen.oterrain.domaine.Publicite;
import com.connecsen.oterrain.domaine.dto.request.PubDtoRequest;
import com.connecsen.oterrain.domaine.dto.response.PubDtoResponse;
import com.connecsen.oterrain.repository.PubRepository;
import com.connecsen.oterrain.utils.Utility;
@Service
public class PubService implements IPubService{
	@Autowired
	private PubRepository PubRepository;
	@Override
	public PubDtoResponse createOrUpdatePub(PubDtoRequest tournoiDtoRequest) {
		Publicite tournoi = Utility.pubDtoRequestConvertToPub(tournoiDtoRequest);
		PubDtoResponse tournoiDtoResponse = Utility.pubConvertToPubDtoResponse(PubRepository.save(tournoi));
		return tournoiDtoResponse;
	}

	@Override
	public PubDtoResponse getPubById(Long id) {
		
		Publicite tournoi = PubRepository.findById(id).get();
		PubDtoResponse tournoiDtoResponse = Utility.pubConvertToPubDtoResponse(PubRepository.save(tournoi));
		return tournoiDtoResponse;
	}

	@Override
	public List<PubDtoResponse> getAllPubs() {
		List<Publicite> tournois =PubRepository.findAll();
		 List<PubDtoResponse> tournoiDtoResponses = tournois.stream()
				 .map(utilisateur -> Utility.pubConvertToPubDtoResponse(utilisateur)).collect(Collectors.toList());
		return tournoiDtoResponses;
	}

	@Override
	public boolean deletePub(Long id) {
		boolean resultat = false;
		Publicite tournoi = PubRepository.findById(id).get();
		if(tournoi != null) {
			PubRepository.deleteById(id);
			resultat =true;
		}
		return resultat;
	
	}


}
