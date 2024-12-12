package com.oops;

class Student2{
	 int roll_no;
	 String name;
	 
	 public void setData() {
		roll_no=1;
		name="himanshu";
	}
}

class Sport1 extends Student2{
	 int sport_marks=34;
	 
}

class Result extends Sport1{
	
	String grade = "A+";
	
	 public void show() {
			System.out.println("roll no is :"+roll_no);
			System.out.println("name is :"+name);
			System.out.println("sport marks is :"+sport_marks);
			System.out.println("the grade is :"+grade);
			
		}
}


public class MultilevelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Result rs  = new Result();
		rs.setData();
		rs.show();
	}

}
