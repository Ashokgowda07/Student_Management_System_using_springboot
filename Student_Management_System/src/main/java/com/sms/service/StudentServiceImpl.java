package com.sms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sms.entity.Student;
import com.sms.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	private StudentRepository studentrepository;
	
	

	public StudentServiceImpl(StudentRepository studentrepository) {
		super();
		this.studentrepository = studentrepository;
	}


@Override
	public List<Student> getAllStudents() {
		return studentrepository.findAll();
	}


@Override
public Student saveStudent(Student student) {
	return studentrepository .save(student);
}


@Override
public Student getStudentById(Long id) {
return studentrepository.findById(id).get();
}


@Override
public Student updateStudent(Student student) {
return studentrepository.save(student);
}


@Override
public void deleteStudentById(Long id) {
	studentrepository.deleteById(id);
	
}

}
