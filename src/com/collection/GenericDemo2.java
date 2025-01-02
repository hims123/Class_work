package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> a1 = new ArrayList<Student>();
		
		Student s1 = new Student();
		s1.setRoll_no(1);
		s1.setName("Himanshu");
		s1.setCity("Surat");
		s1.setDegree("B.E.");
		
		Student s2 = new Student();
		s2.setRoll_no(2);
		s2.setName("Anil");
		s2.setCity("Vadodara");
		s2.setDegree("BCA");
		
		Student s3 = new Student();
		s3.setRoll_no(3);
		s3.setName("Arun");
		s3.setCity("Delhi");
		s3.setDegree("MBA");
		
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		
		
		System.out.println(a1);
		
		Iterator<Student> i1 = a1.iterator();
		
		while (i1.hasNext()) {
			Student std = (Student) i1.next();
			
			System.out.println("Student's Roll no is : "+std.getRoll_no());
			System.out.println("Student's Name is : "+std.getName());
			System.out.println("Student's City is : "+std.getCity());
			System.out.println("Student's Degree is : "+std.getDegree());
			System.out.println();
			
			
		}
		
	}

}
