package assignment;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 	WAP to find the second largest element in an array.
 */
public class Que24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(5);
		a.add(25);
		a.add(75);
		a.add(60);
		a.add(9);
		a.add(30);
		a.add(135);
		a.add(110);
		a.add(95);
		a.add(50);
		
		System.out.println("arraylist : ");
		for (Integer i : a) {
			System.out.print(i + "  ");
		}
		
		Collections.sort(a);
		Collections.reverse(a);
		System.out.println();
		System.out.println("the second largest element is :");
		
		System.out.println(a.get(1));
		
		
	}

}
