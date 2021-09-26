package com.connecsen.oterrain.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.connecsen.oterrain.domaine.Multimedia;
import com.connecsen.oterrain.domaine.dto.request.MultimediaDtoRequest;
import com.connecsen.oterrain.domaine.dto.response.MultimediaDtoResponse;
import com.connecsen.oterrain.repository.MultimediaRepository;
import com.connecsen.oterrain.utils.Utility;
@Service
public class MultimediaService implements IMultimediaService{

	@Autowired
	private MultimediaRepository MultimediaRepository;
	@Override
	public MultimediaDtoResponse createOrUpdateMultimedia(MultimediaDtoRequest tournoiDtoRequest) {
		Multimedia tournoi = Utility.multimediaDtoRequestConvertToMultimedia(tournoiDtoRequest);
		MultimediaDtoResponse tournoiDtoResponse = Utility.multimediaConvertToMultimediaDtoResponse(MultimediaRepository.save(tournoi));
		return tournoiDtoResponse;
	}

	@Override
	public MultimediaDtoResponse getMultimediaById(Long id) {
		
		Multimedia tournoi = MultimediaRepository.findById(id).get();
		MultimediaDtoResponse tournoiDtoResponse = Utility.multimediaConvertToMultimediaDtoResponse(MultimediaRepository.save(tournoi));
		return tournoiDtoResponse;
	}

	@Override
	public List<MultimediaDtoResponse> getAllMultimedias() {
		List<Multimedia> tournois =MultimediaRepository.findAll();
		 List<MultimediaDtoResponse> tournoiDtoResponses = tournois.stream()
				 .map(utilisateur -> Utility.multimediaConvertToMultimediaDtoResponse(utilisateur)).collect(Collectors.toList());
		return tournoiDtoResponses;
	}

	@Override
	public boolean deleteMultimedia(Long id) {
		boolean resultat = false;
		Multimedia tournoi = MultimediaRepository.findById(id).get();
		if(tournoi != null) {
			MultimediaRepository.deleteById(id);
			resultat =true;
		}
		return resultat;
	
	}

}
