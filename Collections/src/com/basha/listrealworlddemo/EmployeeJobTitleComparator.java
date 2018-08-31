package com.basha.listrealworlddemo;

import java.util.Comparator;

public class EmployeeJobTitleComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		
		//return emp1.getJobTitle().compareTo(emp2.getJobTitle());//this is responsible which elements shud be sorted
		
		return emp1.getName().compareTo(emp2.getName());
	}

}
