package assignment;
/*
 * 	WAP to update specific array element by given element.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Que20 {

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
			System.out.print(i1.next() + "  " );
		}
		
		System.out.println();
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index to update (0 to " + (a1.size() - 1) + "): ");
        int index = scanner.nextInt();
        scanner.nextLine();
        if (index < 0 || index >= a1.size()) {
            System.out.println("Invalid index. !!!");
            return;
        }
        System.out.print("Enter the new value: ");
        String n = scanner.nextLine();
        
        a1.set(index, n);
        
       for (Iterator iterator = a1.iterator(); iterator.hasNext();) {
    	   System.out.print(iterator.next() + "  " );
		
	}
        
		
	}

}
