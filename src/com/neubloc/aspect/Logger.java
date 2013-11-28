package com.neubloc.aspect;

import java.util.logging.Level;


public class Logger {
	
	private final static java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger("com.neubloc.aspect");
	
	static {
		LOGGER.setLevel(Level.INFO);
	}
	
	public static void info(String msg) {
		LOGGER.info(msg);
	}


}
