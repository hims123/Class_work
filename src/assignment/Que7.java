package assignment;

/*
 * 	pattern questions
 * 
 * 1.	1
		12
		123
		1234
		12345
	
	2.
		1
		12
		123
		1234
		12345


	3.
		1
		01
		101
		01010
		101010

	4.
	
		1
	   2 2
	  3  3 3
	4  4  4	4

	5.
		*
	  * * *
	 * * * * *
	  * * *
		*

 * 
 * 
 */
public class Que7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.err.println("1st pattern");
		
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.err.println("2nd pattern");
		
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.err.println("3rd pattern");
		
		 for (int i = 1; i <= 5 ; i++) {
	            for (int j = 1; j <= i; j++) {
	                if ((i + j) % 2 == 0) {
	                    System.out.print("1");
	                } else {
	                    System.out.print("0");
	                }
	            }
	            System.out.println(); 
	        }
		
		System.err.println("4th pattern");
		
		for (int i = 1; i <= 4 ; i++) {
            
            for (int j = 1; j <= 4-i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println(); 
        }
		
		
		System.err.println("5th pattern");
		
		for (int i = 1; i <=3; i++) {
			for (int k = i; k <= 3; k++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i*2-1 ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 2; i >=1; i--) {
			for (int k = i; k <= 3; k++) {
				System.out.print("  ");
			}
			for (int j = i*2-1; j >= 1 ; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
