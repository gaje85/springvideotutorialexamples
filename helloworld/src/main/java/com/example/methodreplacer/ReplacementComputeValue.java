package com.example.methodreplacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class ReplacementComputeValue implements MethodReplacer {
	
	public Object reimplement(Object targetObject, 
			Method m,Object[] args) throws Throwable {
		System.out.println("Inside ............... "+targetObject.getClass().getName());
		Integer input1 = (Integer) args[0];
		Integer input2 = (Integer) args[1];
		int i = input1.intValue();
		int j = input2.intValue();
				
		if(m.getName().indexOf("add") != -1){
			Double d = new Double(i+j+10);
			return d;
		}else{
			Double d = new Double(i+j-10);
			return d;
		}
 }
}
