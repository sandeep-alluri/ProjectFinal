package com.coursesexample.factorypattern;

public class CourseManagement {

	public static void main(String[] args) {
		SubjectFactory subjFactory = new SubjectFactory();
		Subject subj1 = subjFactory.getSubject("Maths","81");
		subj1.getSubject();
		subj1.getMarks();
		Subject subj2 = subjFactory.getSubject("Physics","75");
		subj2.getSubject();
		subj2.getMarks();
		Subject subj3 = subjFactory.getSubject("Chemistry","89");
		subj3.getSubject();
		subj3.getMarks();
	}

}
