package com.cgi.model;
 
public class Member {
 
    private int memberId;
    private String memberName;
    private String location;
    private int expr;
    
 
    public int getMemberId() {
        return memberId;
    }
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
    public String getMemberName() {
        return memberName;
    }
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
   
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location= location;
    }
    public int getExpr() {
        return expr;
    }
    public void setExpr(int expr) {
        this.expr = expr;
    }
    @Override
    public String toString() {
        return "Members [memberId=" + memberId + ", Name=" + memberName +", location="+ location +", expr=" + expr +"]";
    }
}


 
