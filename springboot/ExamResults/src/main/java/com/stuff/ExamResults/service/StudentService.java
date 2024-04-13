package com.stuff.ExamResults.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.stuff.ExamResults.entity.Student;
import com.stuff.ExamResults.repo.StudentRepo;

@Service
public class StudentService {
	private StudentRepo studentRepo;

	public StudentService(StudentRepo studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}

	public void add(Student student) {
		studentRepo.save(student);
	}

	public List<Student> getAll() {
		return studentRepo.findAll();
	}

	public String update(Student student) {
		Student oStu = studentRepo.findById(student.getId()).orElse(null);
		if (oStu != null && oStu.getId() == student.getId()) {
			studentRepo.save(student);
			return "success";
		}
		return "id doesn't exist to update";
	}

	public Student get() {
		return studentRepo.findAll().getFirst();
	}

	public Student getById(String id) {
		return studentRepo.findById(id).orElse(null);
	}

	public String deleteAll() {
		studentRepo.deleteAll();
		return "success";
	}

}
