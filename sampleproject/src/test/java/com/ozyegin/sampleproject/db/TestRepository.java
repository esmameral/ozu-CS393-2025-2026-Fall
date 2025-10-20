package com.ozyegin.sampleproject.db;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ozyegin.sampleproject.model.Student;
import com.ozyegin.sampleproject.repo.StudentRepository;

@SpringBootTest
class TestRepository {
	@Autowired
	StudentRepository repo;

	@Test
	void testSave() {
		List<Student> list= repo.findAll();
		System.out.println(list.size());
		Student student1=new Student("ARDA", "CS");
		repo.save(student1);
		List<Student> list2= repo.findAll();
		System.out.println(list2.size());
		assertTrue(list2.size()==list.size()+1);
		assertNotNull(student1.getId());
		System.out.println(student1.getId());
		
		Optional<Student> opt = repo.findById(1);
		Student s = opt.get();
		assertTrue(s.getId()==1);
	}
	
	@Test
	void testDelete() {
		repo.deleteById(1);
		
	}

}
