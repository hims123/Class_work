package com.exception;

import java.util.Scanner;

class AtmException extends Exception{
	
	double amount;
	
	public AtmException(double amount) {
		this.amount= amount;
	}
}

class ATM{
	
double balance=1000;
	
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("amount deposited :"+amount+ " Rs" + " Your current balance is: "+balance);
	}
	
	public void withdraw(double amount) throws AtmException,ArithmeticException {
		if(amount<=balance) {
			balance-=amount;
			System.out.println("amount withdrawn :"+amount+ " Rs" + " Your current balance is: "+balance);
		}else {
			double amt =amount-balance;
			throw new AtmException(amt);
			
		}
		
	} 
}


public class UserDefineException {

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
		} catch ( AtmException e) {
			// TODO Auto-generated catch block
			System.out.println("Insuficiant balance in account!!!!!");
			System.out.println("If you deposit "+e.amount+ " Rs more " + "then you can withdraw "+amount);
		}catch (ArithmeticException e) {
			// TODO: handle exception
		}
		
	}

}
