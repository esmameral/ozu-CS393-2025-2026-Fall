package com.ozyegin.sampleproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ozyegin.sampleproject.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
