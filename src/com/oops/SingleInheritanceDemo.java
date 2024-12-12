package com.oops;

import java.util.Scanner;

class Customer{
	int cust_id;
	String cust_name;
	
	public void setCustData() {
		cust_id=123;
		cust_name="Himanshu";
	}
	
}

class Bank extends Customer{
	double balance=1000;
	public void deposit(double amount) {
		balance+=amount;
		//balance= balance+amount;
		System.out.println("customer id :"+cust_id);
		System.out.println("customer name :"+cust_name);
		System.out.println("Amount deposited is "+amount+
				" and your balance is :"+balance);
	}
	
	public void Withdrow(double amount) {
		
		balance = balance-amount;
		System.out.println("cust id :"+cust_id);
		System.out.println("cust name :"+cust_name);
		System.out.println("Amount withdrowen is "+amount+
				" and your balance is :"+balance);
	}
	
}

class Interest extends Bank {
	
	double interest = 5, total_Interest;
	
	public void CalcuInterest() {
		
		total_Interest = balance*(interest/100);
		System.out.println("your interest amount is : "+total_Interest);
		balance= balance+total_Interest;
		System.out.println("your balance is : "+balance);
	}
}

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		double amount;
		Interest in=new Interest();
		in.setCustData();
		System.out.println("Enter amount to be deposited: ");
		amount=sc.nextDouble();
		in.deposit(amount);
		System.out.println("Enter amount to be withdrowen: ");
		amount=sc.nextDouble();
		in.Withdrow(amount);
		in.CalcuInterest();
		
	}

}
