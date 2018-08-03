package com.to;

public class DepositResultTO {
	private int depositeamount;
	private String name;
	private int accnumber;
	private int oldbalance;
	private int updatedbalance;
	
	public int getOldbalance() {
		return oldbalance;
	}

	public void setOldbalance(int oldbalance) {
		this.oldbalance = oldbalance;
	}

	public int getUpdatedbalance() {
		return updatedbalance;
	}

	public void setUpdatedbalance(int updatedbalance) {
		this.updatedbalance = updatedbalance;
	}

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

	public int getDepositeamount() {
		return depositeamount;
	}

	public void setDepositeamount(int depositeamount) {
		this.depositeamount = depositeamount;
	}
	
}
