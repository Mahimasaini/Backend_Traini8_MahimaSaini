package com.traini8.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.traini8.dao.TrainingCenterDAO;
import com.traini8.dto.TrainingCenterRequestDTO;
import com.traini8.dto.TrainingCenterResponseDTO;
import com.traini8.model.Address;
import com.traini8.model.TrainingCenter;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
@Validated
public class TrainingCenterService {

	@Autowired
	private TrainingCenterDAO dao;
	@Autowired
	private AddressService addressService;
	@Autowired
	private CoursesOfferedService courseOfferedService;

	@Transactional
	public TrainingCenterResponseDTO createTrainingCenter(TrainingCenterRequestDTO requestDTO) {
		// saving training-center
		TrainingCenter trainingCenter = new TrainingCenter(requestDTO);
		trainingCenter = dao.saveTrainingCenter(trainingCenter);

		// saving address
		Address address = addressService.saveAddress(requestDTO.getAddress(), trainingCenter);

		// saving courses offered
		if (requestDTO.getCoursesOffered() != null && !requestDTO.getCoursesOffered().isEmpty()) {
			courseOfferedService.saveCoursesOffered(requestDTO.getCoursesOffered(), trainingCenter);
		}

		// creating response
		TrainingCenterResponseDTO responseDTO = new TrainingCenterResponseDTO(trainingCenter, address,
				requestDTO.getCoursesOffered());
		return responseDTO;

	}

	public List<TrainingCenterResponseDTO> getAllTrainingCenter() {
		// getting all training list
		List<TrainingCenter> trainingCenterList = dao.getAllTrainingCenter();
		List<TrainingCenterResponseDTO> responseList = new ArrayList<TrainingCenterResponseDTO>();
		for (TrainingCenter trainingCenter : trainingCenterList) {
			// creating response
			TrainingCenterResponseDTO response = new TrainingCenterResponseDTO(trainingCenter);
			responseList.add(response);
		}

		return responseList;
	}

}
