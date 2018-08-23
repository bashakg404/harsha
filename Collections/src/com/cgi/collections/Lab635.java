package com.cgi.collections;

import java.util.TreeSet;

public class Lab635 {
	public static void main(String[] args) {
		System.out.println("student info");
		TreeSet ts= new TreeSet();
		System.out.println("::::::::");
		ts.add(new Stud(87, "Sri"));
		ts.add(new Stud(88, "nivas"));
		ts.add(new Stud(89, "Srinivas"));
		ts.add(new Stud(90, "SD"));
		ts.add(new Stud(91, "SVND"));
		
	}}
class Stud implements Comparable{
	int sid;
	String name;
	
	Stud(int sid, String name)
	
	{
		this.sid=sid; this.name=name;
	}
	public int compareTo(Object obj){
		if(obj instanceof Stud){
			Stud std=(Stud) obj;
			return this.name.compareTo(std.name);
		}
		return 0;
	}
	
	public String toString(){
		return sid+"\t"+name;
		
	}
}