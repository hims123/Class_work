package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
 * 	WAP to reverse an array of integer values.
 */
public class Que23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(5);
		a.add(10);
		a.add(15);
		a.add(20);
		a.add(25);
		a.add(30);
		a.add(35);
		a.add(40);
		a.add(45);
		a.add(50);
		
		Iterator i1 = a.iterator();
		
		System.out.println("the origanal arraylist is : ");
		
		while (i1.hasNext()) {
			System.out.print(i1.next() + "  " );
		}
		System.out.println();
		System.out.println("after reverse array is :");
		Collections.reverse(a);
		//a.reversed();
		
		for (Integer i : a) {
			System.out.print(i + "  ");
		}
		
	}

}
