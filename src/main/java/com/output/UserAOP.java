package com.output;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
public class UserAOP {

	
	 @Before("execution(* UserResponse.getSuccess(..))")
	public void beforeGetUser(JoinPoint joinPoint){
		
	
		  System.out.println("User Response    : " + joinPoint.getSignature().getName());
		
	} 
	
}
