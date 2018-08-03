package com.spring.cricketapp;

public class India implements Match {

	//create the field 
	private ResultStatus resultStatus;
	
	//create constructor to inject the dependencies
	/*public India(ResultStatus resultStatus) {
		this.resultStatus = resultStatus;
	}*/
	
	private String indiaCoachName;
	private String indiaCricketBoardName;
	
	public India(){
		System.out.println("Inside No-arg constructor");
	}

	public void setResultStatus(ResultStatus resultStatus) {
		System.out.println("Inside Setter method: result status");
		this.resultStatus = resultStatus;
	}

	

	public String getIndiaCoachName() {
		return indiaCoachName;
	}



	public void setIndiaCoachName(String indiaCoachName) {
		this.indiaCoachName = indiaCoachName;
	}



	public String getIndiaCricketBoardName() {
		return indiaCricketBoardName;
	}



	public void setIndiaCricketBoardName(String indiaCricketBoardName) {
		this.indiaCricketBoardName = indiaCricketBoardName;
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
		
		return "Won:" + resultStatus.getMatchResultStatus();
	}

}
