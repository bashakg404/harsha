package com.basha.springbasha;

public class MyCollegeApp {

	public static void main(String[] args) {
		College theCollege=new Electronics();
		College theColleges=new ComputerScience();
		System.out.println(theCollege.getBranchName());
		System.out.println(theCollege.getDailyTips());
		System.out.println(theColleges.getBranchName());
		System.out.println(theColleges.getDailyTips());
		

	}

}
