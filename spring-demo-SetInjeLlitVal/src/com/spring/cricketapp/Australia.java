package com.spring.cricketapp;

public class Australia implements Match {

	//create the field
	private ResultStatus resultStatus;
	
	private String australiaCoachName;
	private String australiaBoardName;
	
	//create setter method to inject the dependency
	public void setResultStatus(ResultStatus resultStatus) {
		this.resultStatus = resultStatus;
	}

	
	public String getAustraliaCoachName() {
		return australiaCoachName;
	}


	public void setAustraliaCoachName(String australiaCoachName) {
		System.out.println("inside setter coach name");
		this.australiaCoachName = australiaCoachName;
	}


	public String getAustraliaBoardName() {
		return australiaBoardName;
	}


	public void setAustraliaBoardName(String australiaBoardName) {
		System.out.println("inside setter board name");
		this.australiaBoardName = australiaBoardName;
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
		
		return "Result:" +resultStatus.getMatchResultStatus();
	}

}
