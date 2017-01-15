package com.example.opendoor;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class KeyAspect {

	public KeyAspect(){
		
	}
	
	public void insertKey(JoinPoint joinpoint){
		System.out.println("Insert Key "+joinpoint.getArgs()[0]);
	}
	
	public void removeKey(){
		System.out.println("Remove Key");
	}
	public void catchErr(JoinPoint joinPoint,Throwable e){
		System.out.println(" thr = "+e);
	}
	public Object aroundDoor(ProceedingJoinPoint joinpoint){
		System.out.println("Before ..");
		Object obj = null;
		try {
			obj = joinpoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("After "+obj);
		return obj;
	}
	public void aftRet(JoinPoint joinPoint,Object ob){
		System.out.println("return = "+ob);
	}
}
