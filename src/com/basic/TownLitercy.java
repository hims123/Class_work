package com.basic;

public class TownLitercy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double men,women,lit,lit_man,lit_womwn,ill_lit_man,ill_lit_women,totalPopulation = 80000;
		
		men = (52.0/100.0)*80000.0;
		//System.out.println(men);
		women = totalPopulation-men;
		lit = (48.0/100.0)*80000.0;
		lit_man = (35.0/100.0)*80000.0;
		lit_womwn = lit-lit_man;
		ill_lit_man = men-lit_man;
		ill_lit_women = women-lit_womwn;
		
		System.out.println("Total number of illliterate man in village are = "+ill_lit_man);
		System.out.println("Total number of illliterate woman in village are = "+ill_lit_women);
		
	}

}
