package com.studentexample.facadepattern;

import java.util.List;

import com.coursesexample.factorypattern.Subject;

public class StudentDetails {
	private String name;
	private String studentId;
	private List<Subject> subj;
	public StudentDetails(String name, String studentId, List<Subject> subj) {
		super();
		this.name = name;
		this.studentId = studentId;
		this.subj = subj;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public List<Subject> getSubj() {
		return subj;
	}
	public void setSubj(List<Subject> subj) {
		this.subj = subj;
	}
	
	
}
