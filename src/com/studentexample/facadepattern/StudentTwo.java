package com.studentexample.facadepattern;

import java.util.ArrayList;
import java.util.List;

import com.coursesexample.factorypattern.Subject;

public class StudentTwo implements Student{
	StudentDetails student;
	
	public StudentTwo(StudentDetails student) {
		this.student = student;
	}

	@Override
	public void addSubject(Subject s1) {
		if(this.student.getSubj() != null && this.student.getSubj().size() > 0) {
			this.student.getSubj().add(s1);
		}else {
			List<Subject> subjList = new  ArrayList<Subject>();
			subjList.add(s1);
			this.student.setSubj(subjList);
		}
	}

	

	@Override
	public void viewStudent() {
		System.out.println("\r\nThe student details are: ");
		System.out.println("Student Name: "+this.student.getName());
		System.out.println("student ID: "+this.student.getStudentId());
		if(this.student.getSubj() != null && this.student.getSubj().size() > 0) {
			for(Subject subj: this.student.getSubj()) {
				subj.getSubject();
				subj.getMarks();
			}
		}else {
			System.out.println("Subject details not found");
		}
	}

}
