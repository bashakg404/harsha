package com.spring.cricketapp;

public class Australia implements Match {

	//create the field
	private ResultStatus resultStatus;
	
	//create setter method to inject the dependency
	public void setResultStatus(ResultStatus resultStatus) {
		this.resultStatus = resultStatus;
	}

	
	@Override
	public String theTeam1() {
		
		return "Australia lost the toss india bat";
	}

	
	@Override
	public String theTeam2() {
		
		return "India batting";
	}

	@Override
	public String getMatchResultStatus() {
		
		return "Resullt:" +resultStatus.getMatchResultStatus();
	}

}
