package org.mishra.app.service;

import java.util.List;

import org.mishra.app.model.Student;
import org.mishra.app.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentrepository;
	@Override
	public boolean addStudent(Student stud) {
		studentrepository.save(stud);
		return false;
	}
	@Override
	public List<Student> getAllStudent() {
	List<Student> student=	studentrepository.findAll();
	return student ;
	}
	@Override
	public boolean updateStudentById(Student student,long id) {
		student.setId(id);
		studentrepository.save(student);
		
		return true;
	}
	@Override
	public boolean deleteStudentById(long id) {
		studentrepository.deleteById(id);
		return true;
	}

}
