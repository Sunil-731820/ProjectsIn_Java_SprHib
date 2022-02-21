package com.java.spr;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StudentService {
	
	@Autowired
	private StudentRepository repo;
	

	
	public List<Student> showStudent(){
		return repo.findAll();
	}
	
	public Student searchStudent(Long id) {
		return repo.findById(id).get();
		
	}

	
	public void saveOrUpdate(Student student) {
		repo.save(student);
	}
	
	
	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void deleteStudent(Long id) {
		repo.deleteById(id);
	}
	
 
	
	public void updateStudent(Student student , Long id) {
		repo.save(student);
		
	}

}
