package com.oops;

class calculator{
	
	int n1 = 12, n2 = 2;
	//1
	public void sum() {
		System.out.println("sum is :"+(n1+n2));
	}
	//2
	public void sum(int a, int b) {
		System.out.println("sum is :"+(a+b));
	}
	//3 
	public int mul() {
		
		return(n1*n2);
	}
	//4 
	public int mul(int a, int b) {
		
		return(a*b);
	}
}

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calculator cal = new calculator();
		cal.sum();
		cal.sum(100, 50);
		System.out.println("multiplication is : "+cal.mul());
		System.out.println("multiplication is : "+cal.mul(15,2));
		//cal.mul();
		//cal.mul(100, 50);
		
	}

}
