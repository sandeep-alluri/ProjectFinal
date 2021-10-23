package com.assignmentexample.adapterpattern;

public class CourseExam{
	private QuestionPaper qpaper;
	
	public QuestionPaper getQpaper() {
		return qpaper;
	}

	public void setQpaper(QuestionPaper qpaper) {
		this.qpaper = qpaper;
	}

	public void exam(String str) {
		qpaper.exam(str);
	}
}
