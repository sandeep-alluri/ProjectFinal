package com.assignmentexample.adapterpattern;

public class AssignmentManagement {

	public static void main(String[] args) {
		CourseExam cexam = new CourseExam();
		QuestionPaper wexam = new WriteExam();
		cexam.setQpaper(wexam);
		cexam.exam("Exam complete");

	}

}
