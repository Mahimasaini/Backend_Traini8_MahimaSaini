package com.traini8.service;

import org.springframework.stereotype.Service;

import com.traini8.dao.AddressDAO;
import com.traini8.dto.AddressDTO;
import com.traini8.model.Address;
import com.traini8.model.TrainingCenter;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AddressService {

	private AddressDAO dao;

	public Address saveAddress(AddressDTO addressDTO, TrainingCenter trainingCenter) {
		Address address = dao.save(new Address(addressDTO, trainingCenter));
		return address;
	}

}
