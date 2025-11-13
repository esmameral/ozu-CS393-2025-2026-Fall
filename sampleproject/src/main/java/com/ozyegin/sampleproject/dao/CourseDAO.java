package com.ozyegin.sampleproject.dao;

public interface CourseDAO {
	public boolean checkQuota(String courseCode);
	public void updateQuota( int id) ;
	}
