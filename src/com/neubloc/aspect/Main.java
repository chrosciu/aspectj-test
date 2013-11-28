package com.neubloc.aspect;

public class Main {
	
	private static final int TIMES = 50;
	private static final Actions actions = new Actions();

	public static void main(String[] args) { 
		
		long total = 0;
		
		for (int j = 0; j < TIMES; ++j) {
		
			long startTime = System.nanoTime();
			
			for (int i = 0; i < 1000; ++i) {
				actions.foo("bar" + i);
			}
			
			long endTime = System.nanoTime();
			long duration = (endTime - startTime) / 1000;
			total += duration;
			
			System.out.println("duration: " + duration);
		
		}
		
		long average = total / TIMES;
		
		System.out.println("total: " + total);
		System.out.println("average: " + average);
	}

}
