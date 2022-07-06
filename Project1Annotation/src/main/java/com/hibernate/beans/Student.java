package com.hibernate.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Studentdata2")
public class Student {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rollno; //this will be the primary key which will be autogenetared by hibernate
	
	@Column(name = "First_name")
	private String fname;
	
	@Column(name = "last_name")
	private String lname;
	
	@Column(name = "grade")
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
