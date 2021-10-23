package com.admissionexample.commandpattern;

public class RejectCourse implements AdmissionApplication {
	private Course course;
	
	public RejectCourse(Course course) {
		
		this.course = course;
	}

	@Override
	public void processApplication() {
		course.reject();
		
	}
}
