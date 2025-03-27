package com.traini8.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class CoursesOffered {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "course_offered")
	private String courseOffered;

	@ManyToOne
	@JoinColumn(name = "training_center", referencedColumnName = "id")
	private TrainingCenter trainingCenter;

	public CoursesOffered(String courseOffered, TrainingCenter trainingCenter) {
		this.courseOffered = courseOffered;
		this.trainingCenter = trainingCenter;
	}

}
