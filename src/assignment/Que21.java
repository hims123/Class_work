package assignment;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 	WAP to remove the third element from a array list.
 */
public class Que21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a = new ArrayList();
		
		a.add("Utran");
		a.add("VIP");
		a.add("kapodara");
		a.add('H');
		a.add(1000);
		a.add("hirabag");
		a.add(25.25f);
		a.add(new Integer(50));
		a.add("Baroda");
		a.add(9876543210l);
		a.add("Surat");
		
		Iterator i1 = a.iterator();
		
		while (i1.hasNext()) {
			System.out.print(i1.next() + "  " );
		}
		System.out.println();
		a.remove(2);
		
		System.out.println("after removal arraylist is : ");
		
		for (Iterator iterator = a.iterator(); iterator.hasNext();) {
			System.out.print(iterator.next() + "  ");
			
		}
	}

}
