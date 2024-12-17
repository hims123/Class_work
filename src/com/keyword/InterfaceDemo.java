package com.keyword;

class Result{
	
	String grade = "A+";
	
}

class Idemo extends Result implements InterDemo,inter1 {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("id no is : "+id_no);
		System.out.println("mark is : "+mark);
		System.out.println("grade is : "+grade);
	}
	
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Idemo id = new Idemo();
		id.show();
	}

}
