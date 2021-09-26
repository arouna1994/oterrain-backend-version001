package com.connecsen.oterrain.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.connecsen.oterrain.domaine.ListeHeureReserver;
import com.connecsen.oterrain.domaine.dto.request.ListeHeureReserverDtoRequest;
import com.connecsen.oterrain.domaine.dto.response.ListeHeureReserverDtoResponse;
import com.connecsen.oterrain.repository.ListerHeureRepository;
import com.connecsen.oterrain.utils.Utility;

public class ListeHeureReserverService implements IListerHeureReserverService {

	@Autowired
	private ListerHeureRepository listeHeureReserverRepository;

	@Override
	public ListeHeureReserverDtoResponse createOrUpdateListerHeureReserver(ListeHeureReserverDtoRequest tournoiDtoRequest) {
		ListeHeureReserver tournoi = Utility.listeHeureReserverDtoRequestConvertToListeHeureReserver(tournoiDtoRequest);
		ListeHeureReserverDtoResponse tournoiDtoResponse = Utility.listeHeureReserverConvertToListeHeureReserverDtoResponse(listeHeureReserverRepository.save(tournoi));
		return tournoiDtoResponse;
	}

	@Override
	public ListeHeureReserverDtoResponse getListerHeureReserverById(Long id) {
		ListeHeureReserver tournoi = listeHeureReserverRepository.findById(id).get();
		ListeHeureReserverDtoResponse tournoiDtoResponse = Utility.listeHeureReserverConvertToListeHeureReserverDtoResponse(listeHeureReserverRepository.save(tournoi));
		return tournoiDtoResponse;
	}

	@Override
	public List<ListeHeureReserverDtoResponse> getAllListerHeureReservers() {
		List<ListeHeureReserver> tournois =listeHeureReserverRepository.findAll();
		 List<ListeHeureReserverDtoResponse> tournoiDtoResponses = tournois.stream()
				 .map(utilisateur -> Utility.listeHeureReserverConvertToListeHeureReserverDtoResponse(utilisateur)).collect(Collectors.toList());
		return tournoiDtoResponses;
	}

	@Override
	public void deleteListerHeureReserver(Long id) {
		listeHeureReserverRepository.deleteById(id);
		
	}

}
