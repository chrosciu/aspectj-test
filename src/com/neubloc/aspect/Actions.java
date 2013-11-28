package com.neubloc.aspect;

import java.util.Random;

//@Loggable
public class Actions {
	
	private static final Random generator = new Random();
		
	public String foo(String bar) {
		return bar + generator.nextInt();
	}

}
