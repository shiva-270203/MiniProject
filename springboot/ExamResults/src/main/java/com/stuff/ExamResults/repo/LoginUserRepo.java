package com.stuff.ExamResults.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stuff.ExamResults.entity.LoginUser;

@Repository
public interface LoginUserRepo extends JpaRepository<LoginUser, String> {

	LoginUser findByUsername(String username);

}
