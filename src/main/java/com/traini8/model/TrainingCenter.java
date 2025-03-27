package com.traini8.model;

import java.time.LocalDateTime;
import java.util.List;

import com.traini8.dto.TrainingCenterRequestDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "training_center")
public class TrainingCenter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "center_name")
	private String centerName;

	@Column(name = "center_code")
	private String centerCode;

	@Column(name = "student_capacity")
	private Long studentCapacity;

	@Column(name = "created_on")
	private LocalDateTime createdOn;

	@Column(name = "contact_email")
	private String contactEmail;

	@Column(name = "contact_phone")
	private String contactPhone;

	@OneToOne(mappedBy = "trainingCenter")
	private Address address;

	@OneToMany(mappedBy = "trainingCenter")
	private List<CoursesOffered> coursesOfferedList;

	public TrainingCenter(TrainingCenterRequestDTO requestDTO) {
		this.centerName = requestDTO.getCenterName();
		this.centerCode = requestDTO.getCenterCode();
		this.studentCapacity = requestDTO.getStudentCapacity();
		this.createdOn = LocalDateTime.now();
		this.contactEmail = requestDTO.getContactEmail();
		this.contactPhone = requestDTO.getContactPhone();
	}

}
