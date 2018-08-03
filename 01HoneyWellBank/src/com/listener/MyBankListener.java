package com.listener;



import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class MyBankListener implements ServletContextListener {
	
	 static Logger LOG = Logger.getLogger(MyBankListener.class);
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		PropertyConfigurator.configure("D:/ECLIPSE EXAMPLES/ANILKUMAR/JAVA EXAMPLES/07.BLUESTARBANK PROJECT/02bluestarjspbank/log4j.properties");
		LOG.info("inside contextInitialized....");
	}
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		LOG.info("inside contextDestroyed....");
	}


}
