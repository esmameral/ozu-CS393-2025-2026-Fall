package com.ozyegin.sampleproject.dao;

import org.springframework.stereotype.Repository;

@Repository
public class CourseDAOImpl implements CourseDAO {

	@Override
	public boolean checkQuota(String courseCode) {
		
		return true;
	}

}
