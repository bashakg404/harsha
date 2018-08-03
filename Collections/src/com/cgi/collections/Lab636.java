package com.cgi.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Lab636 {
	public static void main(String[] args) {
		System.out.println("student info");
		TreeSet set= new TreeSet(new SidComparator());
		System.out.println("::::::::");
		set.add(new Stuuu(87, "Sri"));
		
		set.add(new Stuuu(8, "Dande"));
		set.add(new Stuuu(5, "nivas"));
		set.add(new Stuuu(80, "SD"));
		Iterator it=set.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println("{{}}}}}}");
	}}
class Stuuu{
	int sid;
	String name;
	Stuuu(int sid, String name){
		this.sid=sid; this.name=name;
		}
	public String toString(){
		return sid+"\t" + name;
	}}
	class SidComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
		if(obj1 instanceof Stuuu && obj2 instanceof Stuuu){
			Stuuu st1=(Stuuu) obj1;
			Stuuu st2=(Stuuu) obj2;
				return st1.sid-st2.sid;
			}
		return 0;
		}

}

