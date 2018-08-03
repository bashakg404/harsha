package com.basha.contextxml;

public class InformationScience implements College {

	private ResultNews resultNews;
	
	public InformationScience(ResultNews resultNews) {
		this.resultNews = resultNews;
	}

	@Override
	public String getYourBranch() {
		
		return "Welcome to the Information Tech World";
	}

	@Override
	public String getYourDreamJobTip() {
		
		return "Learn to develope the apps";
	}

	@Override
	public String getYourResults() {
		
		return "You have good luck: " +resultNews.getYourResults();
	}

}
