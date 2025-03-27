package com.traini8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.traini8.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
