package com.basha.contextxml;

public class ComputerScience implements College {

	//define private field for the dependency
    private ResultNews resultNews;
	
    //define a constructor for dependency injection
    public ComputerScience(ResultNews theresultNews) {
    	resultNews = theresultNews;
	}

    
	@Override
	public String getYourBranch() {
		
		return "Welcome to the Computerization";
	}

	
	@Override
	public String getYourDreamJobTip() {
	
		return "Do coding every day";
	}

	@Override
	public String getYourResults() {
		
		//use my resultnews to get the result
		return resultNews.getYourResults();
	}

}
