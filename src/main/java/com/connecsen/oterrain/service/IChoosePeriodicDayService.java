package com.connecsen.oterrain.service;

import java.util.List;

import com.connecsen.oterrain.domaine.ChoosePeriodicDay;
import com.connecsen.oterrain.domaine.Terrain;

public interface IChoosePeriodicDayService {
	//GESTION ChoosePeriodicDay
	  public ChoosePeriodicDay createOrUpdateChoosePeriodicDay( ChoosePeriodicDay choosePeriodicDay);
	  public  ChoosePeriodicDay getChoosePeriodicDayById(Long id);
	  public List<ChoosePeriodicDay> getAllChoosePeriodicDays();
	  public void deleteChoosePeriodicDay(Long id); 
	  public  Terrain addChoosePeriodicDayToTerrain(Long idTerrain,ChoosePeriodicDay choosePeriodicDay);
}
