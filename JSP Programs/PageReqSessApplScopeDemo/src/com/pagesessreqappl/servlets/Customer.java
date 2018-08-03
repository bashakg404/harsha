package com.pagesessreqappl.servlets;

public class Customer {
	private int customerid;
	private String customername;
	private String email;
	private long phone;
	private Account account;

	public Customer() {
	}

	public Customer(int customerid, String customername, String email, long phone, Account account) {
		this.customerid = customerid;
		this.customername = customername;
		this.email = email;
		this.phone = phone;
		this.account = account;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
