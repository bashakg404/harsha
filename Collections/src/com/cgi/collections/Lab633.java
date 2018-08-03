package com.cgi.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Lab633 {
	public static void main(String[] args) {
		System.out.println("student info");
		TreeSet set= new TreeSet();
		System.out.println("::::::::");
		set.add(new Students(87, "Sri"));
		
		set.add(new Students(8, "Dande"));
		set.add(new Students(5, "nivas"));
		set.add(new Students(80, "SD"));
		Iterator it=set.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println("{{}}}}}}");
	}}
class Students implements Comparable{
	int sid;
	String name;
	Students(int sid, String name){
		this.sid=sid; this.name=name;
		}
	public int compareTo(Object obj){
		if(obj instanceof Students){
			Students st=(Students) obj;
			
				return st.sid-this.sid;
			}
		return 0;
		}
	public String toString(){
		return sid+"\t" + name;
	}
}