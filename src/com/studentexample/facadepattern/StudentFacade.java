package com.studentexample.facadepattern;

import com.coursesexample.factorypattern.Subject;

public class StudentFacade {
	private Student s1;
	private Student s2;
	public StudentFacade(StudentDetails student1, StudentDetails student2) {
		s1 = new StudentOne(student1);
		s2 = new StudentTwo(student2);
	}
	public void addSubjectToStudentOne(Subject subj) {
		s1.addSubject(subj);
	}
	public void addSubjectToStudentTwo(Subject subj) {
		s2.addSubject(subj);
	}
	public void viewStudentOne() {
		s1.viewStudent();
	}
	public void viewStudentTwo() {
		s2.viewStudent();
	}
	
}
