package com.assignmentexample.adapterpattern;

public class WriteExam implements QuestionPaper{

	@Override
	public void exam(String str) {
		
		System.out.println(str);
	}
}
