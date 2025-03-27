package com.traini8.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.traini8.dto.TrainingCenterRequestDTO;
import com.traini8.service.TrainingCenterService;

import jakarta.validation.Valid;

@RestController
public class TrainingCenterController {

	@Autowired
	private TrainingCenterService service;

	@PostMapping("/training-center")
	public ResponseEntity<?> createTrainingCenter(@Valid @RequestBody TrainingCenterRequestDTO requestDTO) {
		return ResponseEntity.ok(service.createTrainingCenter(requestDTO));
	}

	@GetMapping("/training-center")
	public ResponseEntity<?> getAllTrainingCenter() {
		return ResponseEntity.ok(service.getAllTrainingCenter());
	}

}
