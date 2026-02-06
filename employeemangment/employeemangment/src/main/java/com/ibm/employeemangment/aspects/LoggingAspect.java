package com.ibm.employeemangment.aspects;



import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

public class LoggingAspect {
	@Pointcut("execution(public * com.ibm.employeemangment.service.*.*(..))")
	public void allServiceMethods() {}
	@Before("allServiceMethods()")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("$$$$$$$$Before method: "+joinPoint.getSignature().getName());
	}
	@After("allServiceMethods()")
	public void logAfter(JoinPoint joinPoint) {
		System.out.println("After method: "+joinPoint.getSignature().getName());
	}
	@AfterReturning(pointcut = "allServiceMethods()",returning="result")
	public void logAfterReturining(JoinPoint joinPoint,Object result) {
		System.out.println("Mergod returned: "+result);
	}
	@AfterThrowing(pointcut="allServiceMethods()",throwing = "error")
	public void logAfterThrowing(JoinPoint joinPoint,Throwable error) {
		System.out.println("Methid threw exception: "+error);
	}
	@Around("allServiceMethods()")
	public void logAround(ProceedingJoinPoint joinPoint)throws Throwable{
		System.out.println("Before and after method: "+joinPoint.getSignature().getName());
	}
}
