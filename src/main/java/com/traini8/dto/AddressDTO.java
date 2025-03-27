package com.traini8.dto;

import com.traini8.model.Address;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddressDTO {

	private Long id;
	@NotBlank
	private String detailedAddress;
	@NotBlank
	private String city;
	@NotBlank
	private String state;
	@NotBlank
	private String pinCode;

	public AddressDTO(Address address) {
		this.id = address.getId();
		this.detailedAddress = address.getDetailedAddress();
		this.city = address.getCity();
		this.state = address.getState();
		this.pinCode = address.getPinCode();
	}

}
