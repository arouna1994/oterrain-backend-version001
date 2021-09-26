package com.connecsen.oterrain.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.connecsen.oterrain.domaine.HomeOne;
import com.connecsen.oterrain.domaine.dto.request.HomeOneDtoRequest;
import com.connecsen.oterrain.domaine.dto.response.HomeOneDtoResponse;
import com.connecsen.oterrain.repository.HomeOneRepository;
import com.connecsen.oterrain.utils.Utility;
@Service
public class HomeOneService implements IHomeOneService{
	@Autowired
	private HomeOneRepository homeOneRepository;
	@Override
	public HomeOneDtoResponse createOrUpdateHomeOne(HomeOneDtoRequest tournoiDtoRequest) {
		HomeOne tournoi = Utility.homeOneDtoRequestConvertToHomeOne(tournoiDtoRequest);
		HomeOneDtoResponse tournoiDtoResponse = Utility.homeOneConvertToHomeOneDtoResponse(homeOneRepository.save(tournoi));
		return tournoiDtoResponse;
	}

	@Override
	public HomeOneDtoResponse getHomeOneById(Long id) {
		
		HomeOne tournoi = homeOneRepository.findById(id).get();
		HomeOneDtoResponse tournoiDtoResponse = Utility.homeOneConvertToHomeOneDtoResponse(homeOneRepository.save(tournoi));
		return tournoiDtoResponse;
	}

	@Override
	public List<HomeOneDtoResponse> getAllHomeOnes() {
		List<HomeOne> tournois =homeOneRepository.findAll();
		 List<HomeOneDtoResponse> tournoiDtoResponses = tournois.stream()
				 .map(utilisateur -> Utility.homeOneConvertToHomeOneDtoResponse(utilisateur)).collect(Collectors.toList());
		return tournoiDtoResponses;
	}

	@Override
	public boolean deleteHomeOne(Long id) {
		boolean resultat = false;
		HomeOne tournoi = homeOneRepository.findById(id).get();
		if(tournoi != null) {
			homeOneRepository.deleteById(id);
			resultat =true;
		}
		return resultat;
	
	}

}
