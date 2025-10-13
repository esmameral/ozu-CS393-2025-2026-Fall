package com.ozyegin.sampleproject.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import com.ozyegin.sampleproject.model.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void saveStudent(Student s) {
		String sql="INSERT INTO STUDENT (ID, NAME) VALUES (?,?)";
		jdbcTemplate.update(sql, s.getId(),s.getName());
	}

	@Override
	public Student getStudent(int id) {
		String sql="SELECT ID, NAME FROM STUDENT WHERE ID=?";
		return jdbcTemplate.queryForObject(sql, new StudentMapper(), id);
	}

	@Override
	public List<Student> getStudents() {
		String sql="SELECT ID, NAME FROM STUDENT";
		return jdbcTemplate.query(sql, new StudentMapper());
	}
	
	class StudentMapper implements RowMapper<Student> {

		@Override
		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
			Student s=new Student();
			s.setId(rs.getInt(1));
			s.setName(rs.getString(2));
			return s;
		}
		
	}

}
