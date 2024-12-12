package com.oops;

class Student1{
	 int roll_no;
	 String name;
	 
	 public void setData() {
		roll_no=1;
		name="himanshu";
	}
}

class Sport extends Student1{
	 int sport_marks=34;
	 
	 public void show() {
		System.out.println("roll no is :"+roll_no);
		System.out.println("name is :"+name);
		System.out.println("sport marks is :"+sport_marks);
	}
}


public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sport sp=new Sport();
		sp.setData();
		sp.show();
		
	}

}
