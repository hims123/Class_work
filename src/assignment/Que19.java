package assignment;

import java.lang.classfile.instruction.NewMultiArrayInstruction;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * 	WAP to iterate through all elements in an array list.
 */
public class Que19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a1 = new ArrayList();
		
		a1.add("Utran");
		a1.add("VIP");
		a1.add("kapodara");
		a1.add('H');
		a1.add(1000);
		a1.add("hirabag");
		a1.add(25.25f);
		a1.add(new Integer(50));
		a1.add("Baroda");
		a1.add(9876543210l);
		a1.add("Surat");
		
		
		Iterator i1 = a1.iterator();
		
		while (i1.hasNext()) {
			System.out.println(i1.next());
			
		}
	}

}
