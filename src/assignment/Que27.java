package assignment;
/*
 * 	W.A.J.P. to create a custom exception if Customer withdraw amount which is greater than account balance then program will show 
 * custom exception otherwise amount will deduct from account balance.
	Account balance is:2000 Enter withdraw amount:2500
	Sorry, insufficient balance, you need more 500 Rs.To perform this transaction.

 */

import java.util.Scanner;

class AtmBankException extends Exception{
	
	double amount;
	
	public AtmBankException(double amount) {
		this.amount= amount;
	}
}

class ATM{
	
double balance=2000;
	
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("amount deposited :"+amount+ " Rs" + " Your current balance is: "+balance);
	}
	
	public void withdraw(double amount) throws AtmBankException,ArithmeticException {
		if(amount<=balance) {
			balance-=amount;
			System.out.println("amount withdrawn :"+amount+ " Rs" + " Your current balance is: "+balance);
		}else {
			double amt =amount-balance;
			throw new AtmBankException(amt);
			
		}
		
	} 
}

public class Que27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		ATM atm = new ATM();
		
		double amount;
		System.out.println("Enter the amount to be deposited: ");
		amount = sc.nextDouble();
		atm.deposit(amount);
		
		System.out.println("Enter the amount to be withdrawn: ");
		amount = sc.nextDouble();
		try {
			atm.withdraw(amount);
		} catch ( AtmBankException e) {
			// TODO Auto-generated catch block
			System.out.println("Insuficiant balance in account!!!!!");
			System.out.println("If you deposit "+e.amount+ " Rs more " + "then you can withdraw "+amount);
		}catch (ArithmeticException e) {
			// TODO: handle exception
			e.getStackTrace();
		}
		
	}

}
