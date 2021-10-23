package com.coursesexample.factorypattern;

public class Maths implements Subject{
	
	private String marks;
	
	public Maths( String marks) {
		super();

		this.marks = marks;

	}

	@Override
	public void getSubject() {
		System.out.println("subject: Maths");
		
	}

	@Override
	public void getMarks() {
		System.out.println("Marks in Maths: "+this.marks);
	}

}
