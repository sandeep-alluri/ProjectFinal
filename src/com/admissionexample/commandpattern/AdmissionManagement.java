package com.admissionexample.commandpattern;

public class AdmissionManagement {

	public static void main(String[] args) {
		Course c1 = new Course("Maths","Mark");
		Course c2 = new Course("Physics","Eric");
		Course c3 = new Course("Chemistry","Mark");
		
		AcceptCourse aCourse1 = new AcceptCourse(c1); 
		AcceptCourse aCourse2 = new AcceptCourse(c2);
		RejectCourse rCourse = new RejectCourse(c3);
		
		University uni = new University();
		uni.addApplications(aCourse1);
		uni.addApplications(aCourse2);
		uni.addApplications(rCourse);
		
		uni.processApplications();
	}

}
