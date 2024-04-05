package com.altruist.controller;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;

import lombok.extern.slf4j.Slf4j;

@org.aspectj.lang.annotation.Aspect
@Slf4j
public class Aspect {
	
	 

	    @Before("execution(* com.altruist.controller..*.*(..))")
	    public void logBefore(JoinPoint joinPoint) {
	        log.info("Method execution started: {}", joinPoint.getSignature());
	    }

	    @After("execution(* com.altruist.controller..*.*(..))")
	    public void logAfter(JoinPoint joinPoint) {
	        log.info("Method execution completed: {}", joinPoint.getSignature());
	    }

}
