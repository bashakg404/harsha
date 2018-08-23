package com.cgi.collections;

import java.util.Enumeration;
import java.util.Vector;

public class Lab612{
	public static void main(String[] args) {
		Vector v=new Vector();
		v.addElement("basha");
		v.addElement("asha");
		v.addElement("harsha");
		v.addElement("shashi");
		v.addElement("amit");
        v.addElement("bat");
        Enumeration enu = v.elements();
    	while(enu.hasMoreElements())
    		System.out.println(enu.nextElement());
	}}
