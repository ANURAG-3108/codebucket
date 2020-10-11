package com.codebucket.basic;

import java.util.ArrayList;
import java.util.List;



public class TestUM {
	
	public static void main(String[] args) {
		List<Long> alist  = new ArrayList<Long>();
		alist.add(new Long(1));
		System.out.println(alist);
	}
/*	
	
	public static void main(String[] args) {		
		String sourceOfFund = "1";
		if(check(sourceOfFund)){
			System.out.println("YES "  + sourceOfFund);
		}
		else 
			System.out.println("NO "+ sourceOfFund);
	
}
*/
	private static boolean check(String sourceOfFund) {
		if(sourceOfFund.equalsIgnoreCase("1"))
			return false;
		return true;
	}
}