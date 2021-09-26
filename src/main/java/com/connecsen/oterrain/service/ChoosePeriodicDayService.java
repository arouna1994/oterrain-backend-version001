package com.connecsen.oterrain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.connecsen.oterrain.domaine.ChoosePeriodicDay;
import com.connecsen.oterrain.domaine.Terrain;
import com.connecsen.oterrain.repository.ChoosePeriodicDayRepository;
import com.connecsen.oterrain.repository.TerrainRepository;
@Service
public class ChoosePeriodicDayService implements IChoosePeriodicDayService{
     private ChoosePeriodicDayRepository choosePeriodicDayRepository;
     private TerrainRepository terrainRepository;
     
	public ChoosePeriodicDayService(TerrainRepository terrainRepository,ChoosePeriodicDayRepository choosePeriodicDayRepository) {
		super();
		this.choosePeriodicDayRepository = choosePeriodicDayRepository;
		this.terrainRepository = terrainRepository;

	}

	@Override
	public ChoosePeriodicDay createOrUpdateChoosePeriodicDay(ChoosePeriodicDay choosePeriodicDay) {
		// TODO Auto-generated method stub
		return choosePeriodicDayRepository.save(choosePeriodicDay);
	}

	@Override
	public ChoosePeriodicDay getChoosePeriodicDayById(Long id) {
		// TODO Auto-generated method stub
		return choosePeriodicDayRepository.findById(id).get();
	}

	@Override
	public List<ChoosePeriodicDay> getAllChoosePeriodicDays() {
		// TODO Auto-generated method stub
		return choosePeriodicDayRepository.findAll();
	}

	@Override
	public void deleteChoosePeriodicDay(Long id) {
		choosePeriodicDayRepository.deleteById(id);
		
	}

	@Override
	public Terrain addChoosePeriodicDayToTerrain(Long idTerrain, ChoosePeriodicDay choosePeriodicDay) {
		Terrain terrain =terrainRepository.findById(idTerrain).get();
		terrain.getChoosePeriodicDays().add(choosePeriodicDay);
		Terrain terrainSave =terrainRepository.save(terrain);
		return terrainSave;
	}


}
