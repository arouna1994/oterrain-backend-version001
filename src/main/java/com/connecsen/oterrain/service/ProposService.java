package com.connecsen.oterrain.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.connecsen.oterrain.domaine.Propos;
import com.connecsen.oterrain.domaine.dto.request.ProposDtoRequest;
import com.connecsen.oterrain.domaine.dto.response.ProposDtoResponse;
import com.connecsen.oterrain.repository.ProposRepository;
import com.connecsen.oterrain.utils.Utility;
@Service
public class ProposService implements IProposService{
	@Autowired
	private ProposRepository proposRepository;
	@Override
	public ProposDtoResponse createOrUpdatePropos(ProposDtoRequest tournoiDtoRequest) {
		Propos tournoi = Utility.proposDtoRequestConvertToPropos(tournoiDtoRequest);
		ProposDtoResponse tournoiDtoResponse = Utility.proposConvertToProposDtoResponse(proposRepository.save(tournoi));
		return tournoiDtoResponse;
	}

	@Override
	public ProposDtoResponse getProposById(Long id) {
		
		Propos tournoi = proposRepository.findById(id).get();
		ProposDtoResponse tournoiDtoResponse = Utility.proposConvertToProposDtoResponse(proposRepository.save(tournoi));
		return tournoiDtoResponse;
	}

	@Override
	public List<ProposDtoResponse> getAllPropos() {
		List<Propos> tournois =proposRepository.findAll();
		 List<ProposDtoResponse> tournoiDtoResponses = tournois.stream()
				 .map(utilisateur -> Utility.proposConvertToProposDtoResponse(utilisateur)).collect(Collectors.toList());
		return tournoiDtoResponses;
	}

	@Override
	public boolean deletePropos(Long id) {
		boolean resultat = false;
		Propos tournoi = proposRepository.findById(id).get();
		if(tournoi != null) {
			proposRepository.deleteById(id);
			resultat =true;
		}
		return resultat;
	
	}

}
