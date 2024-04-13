package com.stuff.ExamResults.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LoginUser {
	@Id
	private String username;
	private String password;

	public LoginUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginUser(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		return Objects.hash(password, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		LoginUser other = (LoginUser) obj;
		return Objects.equals(password, other.password) && Objects.equals(username, other.username);
	}

}
