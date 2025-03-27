package com.traini8.model;

import com.traini8.dto.AddressDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "detailed_address")
	private String detailedAddress;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "pin_code")
	private String pinCode;

	@OneToOne
	@JoinColumn(name = "training_center_id", referencedColumnName = "id")
	private TrainingCenter trainingCenter;

	public Address(AddressDTO dto, TrainingCenter trainingCenter) {
		this.detailedAddress = dto.getDetailedAddress();
		this.city = dto.getCity();
		this.state = dto.getState();
		this.pinCode = dto.getPinCode();
		this.trainingCenter = trainingCenter;
	}

}
