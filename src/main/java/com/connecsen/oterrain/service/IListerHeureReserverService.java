package com.connecsen.oterrain.service;
import java.util.List;

import com.connecsen.oterrain.domaine.dto.request.ListeHeureReserverDtoRequest;
import com.connecsen.oterrain.domaine.dto.response.ListeHeureReserverDtoResponse;

public interface IListerHeureReserverService {
	 public ListeHeureReserverDtoResponse createOrUpdateListerHeureReserver( ListeHeureReserverDtoRequest tournoiDtoRequest);
	  public  ListeHeureReserverDtoResponse getListerHeureReserverById(Long id);
	  public List<ListeHeureReserverDtoResponse> getAllListerHeureReservers();
	  public void deleteListerHeureReserver(Long id); 
}
