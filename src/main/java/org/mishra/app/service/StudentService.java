package org.mishra.app.service;

import java.util.List;

import org.mishra.app.model.Student;

public interface StudentService {
	public boolean addStudent(Student stud);
	public List<Student> getAllStudent();
	public boolean updateStudentById(Student student,long id);
	public boolean deleteStudentById(long id);
}
