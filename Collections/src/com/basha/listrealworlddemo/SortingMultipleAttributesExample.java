package com.basha.listrealworlddemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingMultipleAttributesExample {

	public static void main(String[] args) {
		
		System.out.println("Sorting bu Multiple Attributes");
		
		List<Employee> listEmployees=new ArrayList<Employee>();
		
		listEmployees.add(new Employee("Basha", "Developer", 29, 45000));
		listEmployees.add(new Employee("Sandeep", "Director", 25, 545000));
		listEmployees.add(new Employee("Ravi", "FrontEndDeveloper", 27, 85000));
		listEmployees.add(new Employee("Nithin", "ASE", 25, 35000));
		listEmployees.add(new Employee("Hazi", "SeniorDeveloper", 27, 95000));
		listEmployees.add(new Employee("Tom", "Designer", 32, 60000));
		listEmployees.add(new Employee("Cruise", "Programmer", 42, 91000));
		listEmployees.add(new Employee("Peter", "Tester", 45, 76000));
		listEmployees.add(new Employee("Rani", "WebDev", 23, 30000));
		listEmployees.add(new Employee("Sneha", "DevOps", 31, 50000));
		listEmployees.add(new Employee("Kavana", "SE", 27, 39000));
		listEmployees.add(new Employee("Shwetha", "SupDev", 27, 55000));
		listEmployees.add(new Employee("Reddy", "SAPDeveloper", 30, 85000));
		listEmployees.add(new Employee("Basha", "Developer", 29, 45000));
		
		System.out.println("Before Sorting");
		
		for(Employee emp:listEmployees){
			System.out.println(emp);
		}
		Collections.sort(listEmployees, new EmployeeChainedComparator(
				new EmployeeJobTitleComparator()));
		
		System.out.println("After Sorting");
		for(Employee emp:listEmployees){
			System.out.println(emp);
		}
	}

}
