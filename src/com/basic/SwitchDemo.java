package com.basic;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choise = 1;
		
		switch (choise) {
		case 1:
			System.out.println("fan is on");
			break;
		case 2:
			System.out.println("light is on");
			break;
		case 3:
			System.out.println("TV is on");
			break;
		case 4:
			System.out.println("AC is on");
			break;
		case 5:
			System.out.println("fridge is on");
			break;

		default:
			System.out.println("invalid choise!!!");
			break;
		}
		
		char ch= 'i';
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Vowel");
			break;

		default:
			System.out.println("Consonant");
			break;
		}
	}

}
