package com.example.javaannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	   public static void main( String[] args )
	    {
		   ClassPathXmlApplicationContext context = 
	    	  new ClassPathXmlApplicationContext(new String[] {"javaannotation.xml"});
	 	
	    	/*AnnoService anno = (AnnoService)context.getBean("dddd");
	    	System.out.println("testing == "+anno);
	       */
		   Example exam = (Example)context.getBean("ee");
	    	System.out.println(exam.getCustomerService());	
	    	System.out.println(exam.getExampleNamed());
	    	context.close();
	    }
	}

