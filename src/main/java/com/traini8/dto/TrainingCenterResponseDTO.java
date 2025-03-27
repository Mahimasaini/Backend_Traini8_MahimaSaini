package com.traini8.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.traini8.model.Address;
import com.traini8.model.TrainingCenter;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TrainingCenterResponseDTO {

	private Long id;
	private String centerName;
	private String centerCode;
	private AddressDTO address;
	private Long studentCapacity;
	private List<String> coursesOffered;
	private LocalDateTime createdOn;
	private String contactEmail;
	private String contactPhone;

	public TrainingCenterResponseDTO(TrainingCenter trainingCenter, Address address, List<String> coursesOffered) {
		this.id = trainingCenter.getId();
		this.centerName = trainingCenter.getCenterName();
		this.centerCode = trainingCenter.getCenterCode();
		this.address = new AddressDTO(address);
		this.studentCapacity = trainingCenter.getStudentCapacity();
		this.coursesOffered = coursesOffered;
		this.createdOn = trainingCenter.getCreatedOn();
		this.contactEmail = trainingCenter.getContactEmail();
		this.contactPhone = trainingCenter.getContactPhone();
	}

	public TrainingCenterResponseDTO(TrainingCenter trainingCenter) {
		this.id = trainingCenter.getId();
		this.centerName = trainingCenter.getCenterName();
		this.centerCode = trainingCenter.getCenterCode();
		this.address = new AddressDTO(trainingCenter.getAddress());
		this.studentCapacity = trainingCenter.getStudentCapacity();
		this.coursesOffered = (trainingCenter.getCoursesOfferedList() != null
				&& !trainingCenter.getCoursesOfferedList().isEmpty())
						? trainingCenter.getCoursesOfferedList().stream().map(co -> co.getCourseOffered()).collect(
								Collectors.toList())
						: new ArrayList<String>();
		this.createdOn = trainingCenter.getCreatedOn();
		this.contactEmail = trainingCenter.getContactEmail();
		this.contactPhone = trainingCenter.getContactPhone();
	}

}
