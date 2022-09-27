package magar.atul.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import magar.atul.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	public Student findByName(String name); 
}
