package com.demo.crud.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.crud.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
