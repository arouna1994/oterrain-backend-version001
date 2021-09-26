package com.connecsen.oterrain.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.connecsen.oterrain.domaine.ChoosePeriodicDay;
import com.connecsen.oterrain.domaine.Terrain;
import com.connecsen.oterrain.service.IChoosePeriodicDayService;
import com.connecsen.oterrain.utils.Utility;
@RestController
public class ChoosePeriodicDayRestController {
	@Autowired
	private IChoosePeriodicDayService iChoosePeriodicDayService;
	
	@PostMapping(Utility.ADD_CHOOSEPERIODICDAY_TO_TERRAIN)
	public Terrain ajouterChoosePeriodicDay(@PathVariable(value = "id") Long idTerrain, @RequestBody ChoosePeriodicDay choosePeriodicDay) {
		Terrain terrain =iChoosePeriodicDayService.addChoosePeriodicDayToTerrain(idTerrain, choosePeriodicDay);
		return terrain;
	}
	
	@GetMapping(Utility.GET_CHOOSEPERIODICDAY_BY_ID)
	public ChoosePeriodicDay getChoosePeriodicDayById(@PathVariable(value = "id") Long userId){
		return iChoosePeriodicDayService.getChoosePeriodicDayById(userId);
    }
	@GetMapping(Utility.DELETE_CHOOSEPERIODICDAY_BY_ID)
	public void getDeleteChoosePeriodicDay(@PathVariable(value = "id") Long userId){
		iChoosePeriodicDayService.deleteChoosePeriodicDay(userId);
    }
}
