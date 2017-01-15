package com.example.constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		try{
		
			//ClassPathResource resource = new ClassPathResource("constructor.xml");
			//BeanFactory factory = new XmlBeanFactory(resource);
			ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("constructor.xml");
			Order order= (Order)appContext.getBean("order");
			System.out.println(order);
			
			
			OrderFactory orderFactory= (OrderFactory)appContext.getBean("orderFact");
			System.out.println("First "+orderFactory);
			OrderFactory orderFactoryOne= (OrderFactory)appContext.getBean("orderFact");
			System.out.println("Second "+orderFactoryOne);
			
			
			/*OrderFactory orderInsFactory= (OrderFactory)factory.getBean("orderInstanceFact");
			System.out.println("instance Factory "+orderInsFactory);
			*/
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
