package com.admissionexample.commandpattern;

import java.util.ArrayList;
import java.util.List;

public class University {
	private List<AdmissionApplication> applicationList = new ArrayList<AdmissionApplication>();
	
	public void addApplications(AdmissionApplication application) {
		applicationList.add(application);
	}
	public void processApplications() {
		for(AdmissionApplication application: applicationList) {
			application.processApplication();
		}
		applicationList.clear();
	}
}
