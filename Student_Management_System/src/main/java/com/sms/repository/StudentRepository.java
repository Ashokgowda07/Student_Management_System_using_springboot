package com.sms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{


	//Student= name of the entity class
	//long = datatype of the primary key



	
}
