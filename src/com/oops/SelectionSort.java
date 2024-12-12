package com.oops;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num= {15,2,65,1,5};
		//num[0]= 12// num[1]=34
//		for (int i = 0; i < num.length; i++) {
//			for (int j = i+1; j < num.length; j++) {
//				if (num[i]>num[j]) {
//					int temp=num[i];
//					num[i]=num[j];
//					num[j]=temp;
//				}
//			}
//			
//		}
		
		System.out.println("Sorted value");
//		for (int i = 0; i < num.length; i++) {
//			System.out.println(num[i]);
//		}
		
		
	Arrays.sort(num);
	for (int i = 0; i < num.length; i++) {
		System.out.println(num[i]);
	}
	}

}
