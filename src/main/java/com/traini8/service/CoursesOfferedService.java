package com.traini8.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.traini8.dao.CoursesOfferedDAO;
import com.traini8.model.CoursesOffered;
import com.traini8.model.TrainingCenter;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CoursesOfferedService {

	private CoursesOfferedDAO dao;

	public void saveCoursesOffered(List<String> courseOffered, TrainingCenter trainingCenter) {
		List<CoursesOffered> courseOfferedList = new ArrayList<CoursesOffered>();
		for (String courseOffer : courseOffered) {
			courseOfferedList.add(new CoursesOffered(courseOffer, trainingCenter));
		}

		dao.saveAllCoursesOffered(courseOfferedList);
	}

}
