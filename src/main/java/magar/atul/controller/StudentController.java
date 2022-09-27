package magar.atul.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import magar.atul.entity.Student;
import magar.atul.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/students")
	public List<Student> findAllStudent(){
		return studentService.getStudents();
	}
	
	@GetMapping("/studentById/{id}")
	public Student findStudentById(@PathVariable("id") int id) {
		return studentService.getById(id);
	}
	
	@GetMapping("/studentByName/{name}")
	public Student findStudentByName(@PathVariable("name") String name) {
		return studentService.getByName(name);
	}
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	
	@PutMapping("/updateStudent")
	public Student updateStudent(@RequestBody Student student) {
		return studentService.updateDetailsStudent(student);
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		return studentService.deleteStudent(id);
	}
}
