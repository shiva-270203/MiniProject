package com.stuff.ExamResults.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stuff.ExamResults.entity.Student;
import com.stuff.ExamResults.service.StudentService;

@CrossOrigin("*")
@RestController

public class StudentController {
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	@PostMapping("/stu")
	public String addStudent(@RequestBody Student student) {
		studentService.add(student);
		return "success";
	}

	@GetMapping("/stus")
	public List<Student> getAllStudents() {
		return studentService.getAll();
	}

	@GetMapping("/stu")
	public Student getStudent() {
		return studentService.get();
	}

	@GetMapping("/stu/{id}")
	public Student getStudentById(@PathVariable String id) {
		return studentService.getById(id);
	}

	@PutMapping("/stu")
	public String putStudent(@RequestBody Student student) {
		return studentService.update(student);
	}

	@DeleteMapping("/stus")
	public String deleteStudents() {
		return studentService.deleteAll();
	}

}
