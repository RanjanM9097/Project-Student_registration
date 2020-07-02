package org.mishra.app.service;

import java.util.List;

import javax.validation.constraints.NotEmpty;

import org.mishra.app.model.Student;
import org.mishra.app.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.sun.istack.NotNull;
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentrepository;
	@Override
	public boolean addStudent(@NotNull Student  stud) {
		studentrepository.save(stud);
		return true;
	}
	@Override
	public List<Student> getAllStudent() {
	List<Student> student=	studentrepository.findAll();
	return student ;
	}
	@Override
	public boolean updateStudentById(@NonNull Student student,@NotEmpty long id) {
	     
		student.setId(id);
		studentrepository.save(student);
		
		return true;
	}
	@Override
	public boolean deleteStudentById(@NotEmpty long id) {
		studentrepository.deleteById(id);
		return true;
	}

}
