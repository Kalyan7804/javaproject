package com.hibernate.beans;

public class Student {
	private int rollno; //this will be the primary key which will be autogenetared by hibernate
	private String fname;
	private String lname;
	private String grade;
	//add non parameterised constr
	public Student() {}
	//add parameterised constr
	public Student(String fname, String lname, String grade) {
		this.fname = fname;
		this.lname = lname;
		this.grade = grade;
	}
	//add setters and getters
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	//add toString method
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", fname=" + fname + ", lname=" + lname + ", grade=" + grade + "]";
	}
	
	

}
