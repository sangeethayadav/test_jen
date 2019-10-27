package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	
	/*@GetMapping("/add")
	public String addStudent(@RequestParam("name")  String name ,@RequestParam("age") Integer age){
		
		System.out.println("test contoller :"+name +"u r age:   "+age);
		
		return name+ "  :first rest controller"  +age+ " :  u r age";
	}
	
	*/
	
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student student){
		
	Student	students =studentService.saveStudent(student);
		return students;
	}
	
}
