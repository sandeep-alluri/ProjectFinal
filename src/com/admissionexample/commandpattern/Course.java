package com.admissionexample.commandpattern;

public class Course {
	private String courseName;
	private String studentName;
	public Course(String courseName, String studentName) {
		super();
		this.courseName = courseName;
		this.studentName = studentName;
	}
	public void accept() {
		System.out.println("Hi "+this.studentName+" your Application for course "+this.courseName+" is accepted");
	}
	public void reject() {
		System.out.println("Hi "+this.studentName+" your Application for course "+this.courseName+" is rejected");
	}
}
