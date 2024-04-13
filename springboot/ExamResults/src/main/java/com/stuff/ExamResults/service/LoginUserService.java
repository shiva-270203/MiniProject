package com.stuff.ExamResults.service;

import org.springframework.stereotype.Service;

import com.stuff.ExamResults.entity.LoginUser;
import com.stuff.ExamResults.repo.LoginUserRepo;

@Service
public class LoginUserService {
	private LoginUserRepo loginUserRepo;

	public LoginUserService(LoginUserRepo loginUserRepo) {
		super();
		this.loginUserRepo = loginUserRepo;
	}

	public Boolean checkUser(LoginUser loginUser) {
		LoginUser oldLogin = loginUserRepo.findById(loginUser.getUsername()).orElse(null);
		if (oldLogin.equals(loginUser)) {
			return true;
		}
		return false;
	}

	public String addUser(LoginUser loginUser) {

		loginUserRepo.save(loginUser);
		return "Success";
	}

}
