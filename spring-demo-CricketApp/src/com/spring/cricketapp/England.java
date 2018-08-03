package com.spring.cricketapp;

public class England implements Match {

	private ResultStatus resultStatus;
	
	public England(ResultStatus resultStatus) {
		this.resultStatus = resultStatus;
	}

	@Override
	public String theTeam1() {
		// TODO Auto-generated method stub
		return "England won the toss";
	}

	@Override
	public String theTeam2() {
		// TODO Auto-generated method stub
		return "India bowling";
	}

	@Override
	public String getMatchResultStatus() {
		// TODO Auto-generated method stub
		return "Lost:" +resultStatus.getMatchResultStatus();
	}

}
