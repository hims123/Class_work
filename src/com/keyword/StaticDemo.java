package com.keyword;

 class SDemo{
	
	int no;
	static int s_no;
	
	public static void show() {
		
		s_no= 123;
		int r_no = 38;
		System.out.println("s_no is : "+s_no);
		System.out.println("r_no is : "+r_no);
		
	}
}

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SDemo s1 = new SDemo();
		SDemo s2 = new SDemo();
		SDemo s3 = new SDemo();
		
		SDemo.show();
		
		s1.no = 1;
		s2.no = 2;
		s3.no = 3;
		
		s1.s_no = 10;
		s2.s_no = 20;
		s3.s_no = 30;
		
		System.out.println("In S1 no is : "+s1.no);
		System.out.println("In S2 no is : "+s2.no);
		System.out.println("In S3 no is : "+s3.no);
		
		System.out.println("In S1 s_no is : "+s1.s_no);
		System.out.println("In S2 s_no is : "+s2.s_no);
		System.out.println("In S3 s_no is : "+s3.s_no);
		
	}

}
