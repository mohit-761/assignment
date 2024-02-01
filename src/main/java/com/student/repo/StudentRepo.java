package com.student.repo;

import org.springframework.data.repository.CrudRepository;

import com.student.entity.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {

}
