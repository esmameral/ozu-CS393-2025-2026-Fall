package com.ozyegin.sampleproject.dao;

import java.util.List;

import com.ozyegin.sampleproject.model.Student;

public interface StudentDAO {
	public void saveStudent(Student s);
	public Student getStudent(int id);
	public List<Student> getStudents();
	public void enrollStudent(int studentId, int courseId);

}
