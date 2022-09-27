package magar.atul.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import magar.atul.entity.Student;
import magar.atul.repository.StudentRepository;
@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	//get product
	public List<Student> getStudents(){
		return studentRepository.findAll();
	}
	
	public Student getById(int id) {
		return studentRepository.findById(id).orElse(null);
		
	}
	
	public Student getByName(String name) {
		return studentRepository.findByName(name);
	}
	
	//add product
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}
	//update product
	public Student updateDetailsStudent(Student student) {
		Student existStudent = studentRepository.findById(student.getId()).orElse(null);
		existStudent.setName(student.getName());
		existStudent.setStandard(student.getStandard());
		existStudent.setBook(student.getBook());
		existStudent.setBookReturned(student.isBookReturned());
		return studentRepository.save(existStudent);
	}
	
	//delete student
	public String deleteStudent(int id) {
		studentRepository.deleteById(id);
		return "deleted"+id;
	}
	
}
