package com.pagesessreqappl.servlets;

public class Account {
	private int accountnumber;
	private String accounttype;
	private double accountbalance;
	private Address address;

	public Account() {
	}

	public Account(int accountnumber, String accounttype, double accountbalance, Address address) {
		this.accountnumber = accountnumber;
		this.accounttype = accounttype;
		this.accountbalance = accountbalance;
		this.address = address;
	}

	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public double getAccountbalance() {
		return accountbalance;
	}

	public void setAccountbalance(double accountbalance) {
		this.accountbalance = accountbalance;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
