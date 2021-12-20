package com.hrms.aop.customermanagement;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingImpl {

	//@Pointcut("within(com.hrms.aop.customermanagement..*)")
	@Around("execution(* com.hrms.aop.customermanagement.*.*(..))")
	public void logBeforeV1(ProceedingJoinPoint  joinPoint) {
		Object[] arg = joinPoint.getArgs();
		System.out.println(arg[0]);
		System.out.println(arg[1]);
		
		System.out.println("Called before executing method... : " + joinPoint.getArgs().toString());
	    try {
			joinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //continue to called method i.e. EmployeeManager.getEmployeeById()
		System.out.println("Called after executing method... : " + joinPoint.getSignature().getName());

	}
	
	
	
	// @Pointcut("within(com.hrms.aop.customermanagement..*)")
	//	@After("execution(* com.hrms.aop.customermanagement.*.*(..))")
		public void logBeforeV1(JoinPoint  joinPoint) {
			System.out.println("Called method by naop... : " + joinPoint.getSignature().getName());
		}


}
