package com.ozyegin.sampleproject.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseDAOImpl implements CourseDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean checkQuota(String courseCode) {
		return true;
	}

	public void updateQuota( int id) {
		String sql = "update Course c set c.quota=c.quota-1 where c.id=?";
		jdbcTemplate.update(sql, id);
	}

}
