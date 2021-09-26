package com.connecsen.oterrain.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.connecsen.oterrain.domaine.Fichier;
import com.connecsen.oterrain.domaine.dto.request.FichierDtoRequest;
import com.connecsen.oterrain.domaine.dto.response.FichierDtoResponse;
import com.connecsen.oterrain.repository.FichierRepository;
import com.connecsen.oterrain.utils.Utility;
@Service
public class FichierService implements IFichierService{
	@Autowired
	private FichierRepository fichierRepository;
	@Override
	public FichierDtoResponse createOrUpdateFichier(FichierDtoRequest tournoiDtoRequest) {
		Fichier tournoi = Utility.fichierDtoRequestConvertToFichier(tournoiDtoRequest);
		FichierDtoResponse tournoiDtoResponse = Utility.fichierConvertToFichierDtoResponse(fichierRepository.save(tournoi));
		return tournoiDtoResponse;
	}

	@Override
	public FichierDtoResponse getFichierById(Long id) {
		
		Fichier tournoi = fichierRepository.findById(id).get();
		FichierDtoResponse tournoiDtoResponse = Utility.fichierConvertToFichierDtoResponse(fichierRepository.save(tournoi));
		return tournoiDtoResponse;
	}

	@Override
	public List<FichierDtoResponse> getAllFichiers() {
		List<Fichier> tournois =fichierRepository.findAll();
		 List<FichierDtoResponse> tournoiDtoResponses = tournois.stream()
				 .map(utilisateur -> Utility.fichierConvertToFichierDtoResponse(utilisateur)).collect(Collectors.toList());
		return tournoiDtoResponses;
	}

	@Override
	public boolean deleteFichier(Long id) {
		boolean resultat = false;
		Fichier tournoi = fichierRepository.findById(id).get();
		if(tournoi != null) {
			fichierRepository.deleteById(id);
			resultat =true;
		}
		return resultat;
	
	}


}
