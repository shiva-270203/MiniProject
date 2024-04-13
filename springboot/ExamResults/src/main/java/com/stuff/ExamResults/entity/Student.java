package com.stuff.ExamResults.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private String id;
	private String name;
	private String clg;
	private String branch;

	private int math;
	private int science;
	private int social;
	private String mathRes;
	private String scienceRes;
	private String socialRes;
	private String res;

	public Student() {
		super();
	}

	public Student(String id, String name, String clg, String branch, int math, int science, int social) {
		super();
		this.id = id;
		this.name = name;
		this.clg = clg;
		this.branch = branch;
		this.math = math;
		this.science = science;
		this.social = social;
		this.mathRes = mathRes;
		this.scienceRes = scienceRes;
		this.socialRes = socialRes;
		this.res = res;
		setMathRes(math);
		setScienceRes(science);
		setSocialRes(social);
		setRes();

	}

//	public Student(String id, String name, String clg, String branch, int math, int science, int social) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.clg = clg;
//		this.branch = branch;
//		this.math = math;
//		this.science = science;
//		this.social = social;
//		setMathRes(math);
//		setScienceRes(science);
//		setSocialRes(social);
//		setRes();
//	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClg() {
		return clg;
	}

	public void setClg(String clg) {
		this.clg = clg;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	public int getSocial() {
		return social;
	}

	public void setSocial(int social) {
		this.social = social;
	}

	public String getMathRes() {
		if (this.math > 30) {

			this.mathRes = "PASS";
		} else {
			this.mathRes = "FAIL";
		}
		return this.mathRes;
	}

	public void setMathRes(int math) {
		if (math > 30) {

			this.mathRes = "PASS";
		} else {
			this.mathRes = "FAIL";
		}
	}

	public String getScienceRes() {
		if (this.science > 30) {

			this.scienceRes = "PASS";
		} else {
			this.scienceRes = "FAIL";
		}
		return this.scienceRes;
	}

	public void setScienceRes(int science) {
		if (science > 30) {

			this.scienceRes = "PASS";
		} else {
			this.scienceRes = "FAIL";
		}
	}

	public String getSocialRes() {
		if (this.social > 30) {

			this.socialRes = "PASS";
		} else {
			this.socialRes = "FAIL";
		}
		return socialRes;
	}

	public void setSocialRes(int social) {
		if (social > 30) {

			this.socialRes = "PASS";
		} else {
			this.socialRes = "FAIL";
		}
	}

	public String getRes() {
		if (getMathRes().equals("PASS") && getScienceRes().equals("PASS") && getSocialRes().equals("PASS")) {
			this.res = "PASS";
		} else {
			this.res = "FAIL";
		}
		return res;
	}

	public void setRes() {
		if (mathRes.equals("PASS") && scienceRes.equals("PASS") && socialRes.equals("PASS")) {
			this.res = "PASS";
		} else {
			this.res = "FAIL";
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(branch, clg, id, math, mathRes, name, res, science, scienceRes, social, socialRes);
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
		Student other = (Student) obj;
		return Objects.equals(branch, other.branch) && Objects.equals(clg, other.clg) && Objects.equals(id, other.id)
				&& math == other.math && Objects.equals(mathRes, other.mathRes) && Objects.equals(name, other.name)
				&& Objects.equals(res, other.res) && science == other.science
				&& Objects.equals(scienceRes, other.scienceRes) && social == other.social
				&& Objects.equals(socialRes, other.socialRes);
	}

}
