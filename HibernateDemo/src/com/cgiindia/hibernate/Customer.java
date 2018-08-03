package com.cgiindia.hibernate;

public class Customer {
private int cid;
private String cname;
private String email;
private long phone;
private String city;
private double balance;

public Customer(){}
public Customer(String cnmae, String email, long phone, String city, double balance){
	this.cname=cname;
	this.email=email;
	this.phone=phone;
	this.city=city;
	this.balance=balance;
	}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
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
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}

}
