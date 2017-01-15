package com.example.constructor;

public class OrderFactory {
	
		private String name;
		private String address;
		private int id;
	 
		 
		private OrderFactory(String name, int age, String address) {
			this.name = name;
			this.id = age;
			this.address = address;
		}
		
		public static OrderFactory getOrder(String name, int age, String address){
			System.out.println("factory is called ....");
			return new OrderFactory(name, age, address);
		}
		public OrderFactory getInstanceOrder(String name, int age, String address){
			System.out.println("Instance factory is called ....");
			return new OrderFactory(name, age, address);
		}
		/*public String toString(){
			return " name : " +name + "\n address : "
	               + address + "\n age : " + id;
		}*/
	 
	}


