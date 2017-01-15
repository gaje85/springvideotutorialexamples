package com.example.opendoor;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class KeyAspect {

	public KeyAspect(){
		
	}
	@Before("execution(* com.example.opendoor.OpenDoor.openDoorWithKey(..))")
	public void insertKey(JoinPoint joinpoint){
		System.out.println("Insert Key "+joinpoint.getArgs()[0]);
	}
	
	@After("execution(* com.example.opendoor.OpenDoor.openDoorWithKey(..))")
	public void removeKey(){
		System.out.println("Remove Key");
	}
	}
