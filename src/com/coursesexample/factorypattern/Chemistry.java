package com.coursesexample.factorypattern;

public class Chemistry implements Subject{
	
	private String marks;
	
	public Chemistry( String marks) {
		super();

		this.marks = marks;

	}
	@Override
	public void getSubject() {
		System.out.println("subject: Chemistry ");
		
	}

	@Override
	public void getMarks() {
		System.out.println("Marks in Chemistry: "+this.marks);
	}

}
