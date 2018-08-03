package com.spring.cricketapp;

public class India implements Match {

	//create the field 
	private ResultStatus resultStatus;
	
	//create constructor to inject the dependencies
	public India(ResultStatus resultStatus) {
		this.resultStatus = resultStatus;
	}
	
	
	@Override
	public String theTeam1() {
		
		return "India won the toss and elected to Bat";
	}

	@Override
	public String theTeam2() {
		
		return "Australia is Bowling";
	}


	@Override
	public String getMatchResultStatus() {
		
		return "Won:" +resultStatus.getMatchResultStatus();
	}

}
