package com.listener.demo;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class MyContextAttributeListener implements ServletContextAttributeListener {
	
	public MyContextAttributeListener() {
		System.out.println("**MyContextAttributeListener() Def cons");
	}
	
	public void attributeAdded(ServletContextAttributeEvent event) {
		String name = event.getName();
		System.out.println("===8===");
		String value = event.getValue().toString();
		System.out.println("attribute added():" + name + "\t" + value);
	}

	public void attributeRemoved(ServletContextAttributeEvent event) {
		String name = event.getName();
		String value = event.getValue().toString();
		System.out.println("===9===");
		System.out.println("Attribute removed:" + name + "\t" + value);
	}

	public void attributeReplaced(ServletContextAttributeEvent event) {
		String name = event.getName();
		String value = event.getValue().toString();
		System.out.println("Attribute Replaced:" + name + "\t" + value);
		System.out.println("===10===");
	}
}
