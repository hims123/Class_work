package assignment;

/*
 * 	WAP to compute the sum of the first 100 prime numbers.
 */
public class Que8 {

	public static boolean prime(int n) {
		
		if (n<=1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n) ; i++) {
			if (n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0,count = 0,n=2;
		 while (count < 100) {
	            if (prime(n)) {
	                sum = sum + n;  
	                count++;   
	            }
	            n++;  
	        }
		
		 System.out.println("The sum of the first 100 prime numbers is: " + sum);
	}

}
