package com.basic;

/*
 * 12345
 * 12345
 * 12345
 * 12345
 */

/*
 * for space it depends on first loop(i)
 * 
 */
public class PatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		*/
		
		/*
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 */
		/*for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		*/
		
		/*
		 * 5
		 * 54
		 * 543
		 * 5432
		 * 54321
		 */
	/*	for (int i = 5; i >=1; i--) {
			for (int j = 5; j >=i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		*/
		
		/*
		 * 5
		 * 45
		 * 345
		 * 2345
		 * 12345
		 */
		
	/*	for (int i = 5; i>=1 ; i--) {
			for (int j = i; j <=5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}*/
		
		
		/*
		 * 1
		 * 21
		 * 321
		 * 4321
		 * 54321
		 */
		
	/*	for (int i = 1; i <=5; i++) {
			for (int j = i; j >=1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		*/
		
		/*
		 * 1
		 * 10
		 * 101
		 * 1010
		 * 10101
		 * 
		 * 
		 * for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j%2);
			}
			System.out.println();
		}
		 * 
		 *     1
		 *    10
		 *   101
		 *  1010
		 * 10101
		 */
		
		for (int i = 1; i <=5; i++) {
			for (int k = i; k <= 5; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print(j%2);
			}
			System.out.println();
		}
		
		/*
		 *     1
		 *    1 2
		 *   1 2 3
		 *  1 2 3 4
		 * 1 2 3 4 5
		 */
		
		for (int i = 1; i <=5; i++) {
			for (int k = i; k <= 5; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print(" "+j);
			}
			System.out.println();
		}
		
		/*
		 *     1
		 *    1 0
		 *   1 0 1
		 *  1 0 1 0
		 * 1 0 1 0 1
		 */
		
		for (int i = 1; i <=5; i++) {
			for (int k = i; k <= 5; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print(" "+j%2);
			}
			System.out.println();
		}
		
		/*
		 *      *
		 *     * *
		 *    * * *
		 *   * * * * 
		 *  * * * * *
		 *   * * * * 
		 *    * * *
		 *     * *
		 *      *
		 *      
		 *      *
		 *     ***
		 *    *****
		 *     ***
		 *      *
		 *      
		 *      
		 */
		
		for (int i = 1; i <=3; i++) {
			for (int k = i; k <= 3; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i*2-1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 2; i >=1; i--) {
			for (int k = i; k <= 3; k++) {
				System.out.print(" ");
			}
			for (int j = i*2-1; j >= 1 ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for (int i = 1; i <=5; i++) {
			for (int k = i; k <= 5; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i*2-1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 4; i >=1; i--) {
			for (int k = i; k <= 5; k++) {
				System.out.print(" ");
			}
			for (int j = i*2-1; j >= 1 ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 *       a
		 *       ab
		 *       abc
		 *       abcd
		 *       abcde
		 *       
		 *       
		 *       a
		 *       bc
		 *       def
		 *       ghij
		 *       klmno
		 */
			
		int a= 97;
		for (int i = 0; i <=4; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print((char)(a+j));
			}
			System.out.println();
		}
	//	System.out.println();
		
		
	/*	for (char i = 'a'; i <='e'; i++) {
			for (char j = 'a'; j <=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	*/	
		
		System.out.println();
		
		for (int i = 1; i <=5 ; i++) {
			for (int j = 1; j <i+1; j++) {
				System.out.print((char)(a++));
			}
			System.out.println();
		}
		
		
	}
	
}
