package com.cmn_class;

class Calc{
	public void sum() {
		System.out.println(100+900);
	}
}
public class WrapperClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="150";
		String s2="200";
		
		System.out.println("auto boxing is :"+s1);
		int i2=100;
		Integer i1=new Integer(i2);
		System.out.println("Boxing is :"+i1);
		
		int i3=i1;
		System.out.println("Unboxing is :"+i3);
		
		float i4=Float.parseFloat(s1);
		int i5=Integer.parseInt(s2);
		System.out.println(i4+i5);
		
		String s4=i1.toString();
		System.out.println("s4 :"+s4);
		
		Calc c1=new Calc();
		c1.sum();
		
	}

}
