package com.coursesexample.factorypattern;

public class SubjectFactory {
	public Subject getSubject(String subj,String Marks) {
		if (subj.equals("Maths")) {
			return new Maths(Marks);
		}
		if (subj.equals("Physics")) {
			return new Physics(Marks);
		}
		if (subj.equals("Chemistry")) {
			return new Chemistry(Marks);
		} else {
			return null;
		}
	}
}
