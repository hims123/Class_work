package com.oops;

import java.security.PublicKey;

class abc{
	static int roll_no;
	static String name;
	
	public static void show() {
		
		roll_no = 15;
		name="himanshu";
		
	System.out.println("rollno ="+roll_no);
	System.out.println("name = "+name);
	
		
	}
}

public class DemoPeerToPeer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//abc a1 = new abc();
		//abc a2 = new abc();
		//abc a3 = new abc();
		
		abc.roll_no = 158;
		abc.roll_no = 158;
		abc.roll_no = 158;
		
		abc.show();
		abc.show();
		abc.show();
		
	}

}
