package com.springboot.jmeter.jmeterdemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.jmeter.jmeterdemo.domain.Student;

public interface StudentRepository extends MongoRepository<Student, String> {

}