package com.stuff.ExamResults.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stuff.ExamResults.entity.LoginUser;
import com.stuff.ExamResults.service.LoginUserService;

@RestController
public class LoginUserController {
	private LoginUserService loginUserService;

	public LoginUserController(LoginUserService loginUserService) {
		super();
		this.loginUserService = loginUserService;
	}

	@CrossOrigin
	@PostMapping("/login")
	public String welcome(@RequestBody LoginUser loginUser) {
		Boolean b = loginUserService.checkUser(loginUser);
		if (b == true) {
			return "success";
		}
		return "failed";

	}

	@PostMapping("/signup")
	public String signUp(@RequestBody LoginUser loginUser) {

		return loginUserService.addUser(loginUser);
	}

}
