package com.example.opendoor;

public class OpenDoorImpl implements OpenDoor{

	public OpenDoorImpl(){
		
	}
	
	public int openDoorWithKey(int num){
		System.out.println("Opening the Door ....");
		return 2;
	}

	@Override
	public int openDoorWithPassword() {
		System.out.println("Opening the Door with Password ...");
		return 1000;
	}
	public void throwErr() throws Exception{
		System.out.println("in excep throw");
		int j = 100/0;
	}

	@Override
	public int openDoorWithReturn() {
		System.out.println("openDoorWithReturn is called ");
		return 2000;
	}
}
