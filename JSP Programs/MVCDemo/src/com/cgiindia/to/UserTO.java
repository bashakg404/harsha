package com.cgiindia.to;

public class UserTO {
private int userId;
private String fname;
private String email;
private long phone;
private String username;
private String password;
public UserTO(){}
public UserTO(int userId, String fname, String email, long phone, String username, String password){
	this.userId=userId;
	this.fname=fname;
	this.email=email;
	this.phone=phone;
	this.username=username;
	this.password=password;
	
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
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
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
