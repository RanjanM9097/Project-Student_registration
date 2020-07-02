package org.mishra.app.controller;

import java.util.List;

import javax.validation.constraints.NotEmpty;

import org.mishra.app.model.Student;
import org.mishra.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.istack.NotNull;

@Controller
@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService service;
	
	@PostMapping("/create")
	 public String addStudent(@NotNull @RequestBody Student stud) {
		service.addStudent(stud);
		 return "sucessfully registerd ";
	 }
	@GetMapping("/read")
	  public List<Student> getAllStudent(){
		List<Student> stud=service.getAllStudent();
		 return stud;
	  }
	@PutMapping("/update/{id}")
	public String updateStudentById(@RequestBody Student student ,@PathVariable long id) {
		  service.updateStudentById(student,id);
		
		return "Update Successfully id : " +id;
	}
	@DeleteMapping("/delete/{id}")
	public String deleteStudentById(@NotEmpty(message="id may not be empaty") @PathVariable long id) {
		service.deleteStudentById(id);
		return "Deleted Successfully id :  " +id;
	}
	

}
