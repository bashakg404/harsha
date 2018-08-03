package com.cgi.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Lab637 {
	public static void main(String[] args) {
		System.out.println("student info");
		TreeSet set= new TreeSet(new SidComparat());
		System.out.println("::::::::");
		set.add(new Stdt(87, "Sri"));
		
		set.add(new Stdt(8, "Dande"));
		set.add(new Stdt(5, "nivas"));
		set.add(new Stdt(80, "SD"));
		Iterator it=set.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println("{{}}}}}}");
	}}
class Stdt{
	int sid;
	String name;
	Stdt(int sid, String name){
		this.sid=sid; this.name=name;
		}
	public String toString(){
		return sid+"\t" + name;
	}}
	class SidComparat implements Comparator{
	public int compare(Object obj1, Object obj2){
		if(obj1 instanceof Stdt && obj2 instanceof Stdt){
			Stdt st1=(Stdt) obj1;
			Stdt st2=(Stdt) obj2;
				return st1.name.compareTo(st2.name);
			}
		return 0;
		}

}

