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
	

	//function to show records
	public List<Student> showStudent(){
		return repo.findAll();
	}
	
	//function for search Records
	public Student searchStudent(Long id) {
		return repo.findById(id).get();
		
	}

	//function to save records here 
	public void saveOrUpdate(Student student) {
		repo.save(student);
	}
	
	
	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void deleteStudent(Long id) {
		repo.deleteById(id);
	}
	
 //this is the function for update the records 
	
	public void updateStudent(Student student , Long id) {
		repo.save(student);
		
	}

}
