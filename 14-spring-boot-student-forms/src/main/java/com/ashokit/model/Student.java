package com.ashokit.model;

import java.util.Arrays;

import lombok.Data;


public class Student {
 private String name;
 private String pwd;
 private String email;
 private long phno;
 private String course;
 private String gender;
 private String[] prefferableTimings;
 
 
public Student() {
	
}
public Student(String name, String pwd, String email, long phno, String course, String gender,
		String[] prefferableTimings) {
	super();
	this.name = name;
	this.pwd = pwd;
	this.email = email;
	this.phno = phno;
	this.course = course;
	this.gender = gender;
	this.prefferableTimings = prefferableTimings;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String[] getPrefferableTimings() {
	return prefferableTimings;
}
public void setPrefferableTimings(String[] prefferableTimings) {
	this.prefferableTimings = prefferableTimings;
}
@Override
public String toString() {
	return "Student [name=" + name + ", pwd=" + pwd + ", email=" + email + ", phno=" + phno + ", course=" + course
			+ ", gender=" + gender + ", prefferableTimings=" + Arrays.toString(prefferableTimings) + "]";
}

 
 
}
