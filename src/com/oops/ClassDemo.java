package com.oops;

class student{
	
	int id;
	String name;
	
	public void setData() {
		id = 123;
		name = "Himanshu";
	}
	
	public void display() {
		System.out.println("student id is = "+id);
		System.out.println("student name is = "+name);
	}
}
public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		student s1 = new student();
		s1.setData();
		s1.display();
	}

}
