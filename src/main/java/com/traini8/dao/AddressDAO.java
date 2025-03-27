package com.traini8.dao;

import org.springframework.stereotype.Component;

import com.traini8.model.Address;
import com.traini8.repository.AddressRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class AddressDAO {

	private AddressRepository repository;

	public Address save(Address address) {
		return repository.save(address);
	}
}
