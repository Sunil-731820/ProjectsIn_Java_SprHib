package com.java.spr;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {
	@Autowired
	private StudentService service;
	


	@RequestMapping(value = "/showStudent")
	public List<Student> showStudent(){
		return service.showStudent();
	}
	
	
	@RequestMapping("/student/{id}")
	public ResponseEntity<Student> get(@PathVariable Long id) {
		try {
		Student student = service.searchStudent(id);
		return new ResponseEntity<Student>(student,HttpStatus.OK);
		} catch(NoSuchElementException e) {
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
	}
 
	
	//inserting the data into the data base  using postman api testing method okay 
	// this is also called as post method for the spring boot okay 
	@PostMapping("/student")
	private Long saveStudent(@RequestBody Student student) {
		service.saveOrUpdate(student);
		return student.getId();
	}
	
	//creating a delete mapping that deletes a specified Student here   
	@DeleteMapping("/studentDelete/{id}")  
	private void deleteStudent(@PathVariable Long id)   
	{  
	service.deleteStudent(id);  
	}  
	
	//creating put mapping that updates the student detail   
	@PutMapping("/studentUpdate")
	private Student update(@RequestBody Student student) {
		service.saveOrUpdate(student);
		return student;
	}
	

}
