package com.codebucket.strarray;

public class ReverseArrayDemo {

	public static void main(String [] args){
		int []arr = {5833,9919,6731};
		reverse(arr, 0, arr.length-1);
		ArrayUtil.printArray(arr);
	}
	
	public static void reverse(int arr[], int start, int end){
		int temp;
		System.out.println("");
		while(start < end){
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
