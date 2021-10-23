package com.studentexample.facadepattern;

import com.coursesexample.factorypattern.Subject;
import com.coursesexample.factorypattern.SubjectFactory;

public class StudentManagement {

	public static void main(String[] args) {
		SubjectFactory subjFactory = new SubjectFactory();
		Subject subj1 = subjFactory.getSubject("Maths","81");
		Subject subj2 = subjFactory.getSubject("Physics","75");
		Subject subj3 = subjFactory.getSubject("Chemistry","89");
		StudentDetails s1 = new StudentDetails("Mark","1",null);
		StudentDetails s2 = new StudentDetails("Eric","2",null);
		StudentFacade studentMaker = new StudentFacade(s1,s2);
		studentMaker.addSubjectToStudentOne(subj1);
		studentMaker.viewStudentOne();
		studentMaker.addSubjectToStudentTwo(subj2);
		studentMaker.addSubjectToStudentTwo(subj3);
		studentMaker.viewStudentTwo();

	}

}
