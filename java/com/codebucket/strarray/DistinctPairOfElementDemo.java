package com.codebucket.strarray;




/**
 * Input: arr[] = {1, 5, 3, 4, 2}, k = 3
 * Output: 2
 * 
 * There are 2 pairs with difference 3, the pairs are {1, 4} and {5, 2} 
 * Input: arr[] = {8, 12, 16, 4, 0, 20}, k = 4
 * Output: 5
 * 
 * There are 5 pairs with difference 4, the pairs are {0, 4}, {4, 8}, 
 * {8, 12}, {12, 16} and {16, 20} 
 */
public class DistinctPairOfElementDemo {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 9, 10, 11, 28, 210, 222, 211, 214, 0, 12,
				14 };
		int k = 213;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == k) {
					System.out.println("the elements are " + arr[i]+ "," + arr[j]);
					count++;
				}
			}
		}
		System.out.println("count of such elements are " + count);
	}
}
