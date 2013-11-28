package com.neubloc.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	@Pointcut("within(@com.neubloc.aspect.Loggable *)")
	public void annotatedWithLoggable() {}
	
	@Pointcut("execution(public * *(..))")
	public void allPublicMethods() {}
	
	@Pointcut("annotatedWithLoggable() && allPublicMethods()")
	public void entryPoints() {}
	
	@Before("entryPoints()")
	public void logBefore(JoinPoint joinPoint) {		
	} 
	
}
