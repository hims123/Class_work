package com.basic;
import java.util.*;

public class CityTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter city's temprature(*F) = ");
		float tmp = sc.nextFloat();
		
		float degree =(tmp-32)*5/9;
		
		System.out.println("city's tmperature in *C is = "+degree+"*C");
		
	}

}
