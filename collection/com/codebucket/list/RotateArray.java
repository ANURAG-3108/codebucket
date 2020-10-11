package com.codebucket.list;

public class RotateArray {

	public static void main(String[] args) {

		String[] aList = { "Anurag", "Tiwari", "Alwar", "Rajasthan", "india" };
		if (aList == null || aList.length == 0) {
			throw new IllegalArgumentException("Illegal argument!");
		}

		for (int i = aList.length - 1; i > 0; i--) {
			String temp = aList[i];
			aList[i] = aList[i - 1];
			aList[i - 1] = temp;

		}

		for (String bList : aList) {
			System.out.println("Print ::  " + bList);
		}
	}
}