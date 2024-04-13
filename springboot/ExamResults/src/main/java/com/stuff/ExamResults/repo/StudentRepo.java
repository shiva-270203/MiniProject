package com.stuff.ExamResults.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stuff.ExamResults.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, String> {

}
