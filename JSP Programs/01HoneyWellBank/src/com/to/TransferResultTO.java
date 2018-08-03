package com.to;

public class TransferResultTO {
	private int destinationaccountnumber;
	private int transferamount;
	private String name;
	private int accnumber;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccnumber() {
		return accnumber;
	}
	public void setAccnumber(int accnumber) {
		this.accnumber = accnumber;
	}
	public int getDestinationaccountnumber() {
		return destinationaccountnumber;
	}
	public void setDestinationaccountnumber(int destinationaccountnumber) {
		this.destinationaccountnumber = destinationaccountnumber;
	}
	public int getTransferamount() {
		return transferamount;
	}
	public void setTransferamount(int transferamount) {
		this.transferamount = transferamount;
	}
	
	
}
