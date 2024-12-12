package com.oops;

class Parent{
	String p_name;
	long ph_no;
	
	public void setParentData() {
		
		p_name = "Salim Khan";
		ph_no = 9876543210l;
		
	}
}

class child1 extends Parent{
	
	String name = "Salman";
	
	public void show() {
		
		System.out.println("For any complain of "+name+" "+p_name+" contact on "+ph_no+".   thank you!!!");
	}
}

class child2 extends Parent{

	String name = "Suhail";
	
	public void show() {
		
		System.out.println("For any complain of "+name+" "+p_name+" contact on "+ph_no+".   thank you!!!");
	}
}


public class HieraricalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		child1 ch1 = new child1();
		child2 ch2 = new child2();
		
		ch1.setParentData();
		ch1.show();
		
		ch2.setParentData();
		ch2.show();
		
	}

}
