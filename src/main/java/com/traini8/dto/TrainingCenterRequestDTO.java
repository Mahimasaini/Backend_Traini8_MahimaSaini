package com.traini8.dto;

import java.util.List;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class TrainingCenterRequestDTO {

	@Size(max = 40, message = "Center name must be less than 40 characters")
	@NotBlank
	private String centerName;

	@Pattern(regexp = "^[a-zA-Z0-9]{12}$", message = "Text must be exactly 12 alphanumeric characters")
	@NotBlank
	private String centerCode;

	@NotNull
	private AddressDTO address;
	private Long studentCapacity;
	private List<String> coursesOffered;

	@Email(message = "Invalid email format")
	private String contactEmail;

	@Pattern(regexp = "^\\+?[1-9]\\d{1,14}$", message = "Invalid phone number format")
	@NotNull
	private String contactPhone;

}
