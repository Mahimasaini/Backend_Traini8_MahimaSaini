package com.traini8.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.traini8.model.CoursesOffered;
import com.traini8.repository.CoursesOfferedRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class CoursesOfferedDAO {

	private CoursesOfferedRepository repository;

	public void saveAllCoursesOffered(List<CoursesOffered> courseOfferedList) {
		repository.saveAll(courseOfferedList);
	}

}
