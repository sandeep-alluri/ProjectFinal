package com.admissionexample.commandpattern;

public class AcceptCourse implements AdmissionApplication{
	private Course course;
	
	public AcceptCourse(Course course) {
		
		this.course = course;
	}

	@Override
	public void processApplication() {
		course.accept();
		
	}
}
