package assignment;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 	WAP to Copy one array into another
 */
public class Que22 {

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
		
		System.out.println("the origanal arraylist is : ");
		
		while (i1.hasNext()) {
			System.out.print(i1.next() + "  " );
		}
		
		ArrayList copy = new ArrayList();
		
		//copy = (ArrayList) a.clone();
		
		copy.addAll(a);
		System.out.println();
		System.out.println("the copy arraylist is : ");
		Iterator i2 = copy.iterator();
		while (i2.hasNext()) {
			System.out.print(i2.next() + "  " );
		}
		
	}

}
