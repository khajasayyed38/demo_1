package com.demo.crud;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.crud.entity.Student;
import com.demo.crud.repository.StudentRepository;

@SpringBootTest
class DemoApp2ApplicationTests {
	
	@Autowired
	private StudentRepository studentRepo;
	
	@Test
	void saveRecord() {
		
		Student s= new Student();
		s.setName("Pankaj");
		s.setCourse("Testing Course");
		s.setFee(1000);
		
		studentRepo.save(s);
	}
	
	@Test
	void deleteRecord() {
		studentRepo.deleteById(6L);
	}
	
	@Test
	void readRecord() {
		Optional<Student> findById = studentRepo.findById(1L);
		Student student = findById.get();
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getCourse());
		System.out.println(student.getFee());
		
	}
	
	@Test
	void updateRecord() {
		Optional<Student> findById = studentRepo.findById(2L);
		Student student = findById.get();
		student.setCourse("Full dev");
		studentRepo.save(student);
	}

}
