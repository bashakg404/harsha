package com.basha.springbasha;

public class ComputerScience implements College {

	@Override
	public String getBranchName() {
		
		return "Welcome to the Software World";
	}

	@Override
	public String getDailyTips() {

		return "Do Code Daily";
	}

}
