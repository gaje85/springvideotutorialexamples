package com.example.autowire;

public class A {

	private B bb;
	private C cc;
	public B getBb() {
		return bb;
	}
	public void setBb(B bb) {
		System.out.println("inside set bb");
		this.bb = bb;
	}
	public C getCc() {
		return cc;
	}
	public void setCc(C cc) {
		this.cc = cc;
		System.out.println("inside set cc");
	}
}
