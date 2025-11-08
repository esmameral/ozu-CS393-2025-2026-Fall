package com.ozyegin.sampleproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ozyegin.sampleproject.model.Instructor;
@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Integer> {

}
