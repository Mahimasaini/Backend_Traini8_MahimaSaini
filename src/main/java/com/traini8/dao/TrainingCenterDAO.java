package com.traini8.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.traini8.model.TrainingCenter;
import com.traini8.repository.TrainingCenterRepository;

@Component
public class TrainingCenterDAO {

	@Autowired
	private TrainingCenterRepository repository;

	public TrainingCenter saveTrainingCenter(TrainingCenter trainingCenter) {
		return repository.save(trainingCenter);
	}

	public List<TrainingCenter> getAllTrainingCenter() {
		List<TrainingCenter> trainingCenterList = repository.findAll();
		return trainingCenterList;
	}

}
