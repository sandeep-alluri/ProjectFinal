package com.coursesexample.factorypattern;

public class Physics implements Subject{
	
	private String marks;
	
	public Physics( String marks) {
		super();

		this.marks = marks;

	}

	@Override
	public void getSubject() {
		System.out.println("subject: Physics");
		
	}

	@Override
	public void getMarks() {
		System.out.println("Marks in Physics: "+this.marks);
	}

}
