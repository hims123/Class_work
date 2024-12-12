package com.oops;

class A{
	
	public A() {
		System.out.println("In Constructor A");
	}
	
	public void show() {
		
		System.out.println("In A show");
	}
}

class B extends A{
	
	public B() {
		System.out.println("In Constructor B");
	}
	
	public void show() {
		
		super.show();
		System.out.println("In B show");
	}
}

class C extends B{
	
	public C() {
		System.out.println("In Constructor C");
	}
	
	public void show() {
		
		super.show();
		System.out.println("In C show");
	}
}

public class ChainedConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c = new C();
		c.show();
	}

}
