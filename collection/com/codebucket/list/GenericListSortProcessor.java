package com.codebucket.list;

import java.util.Collection;

public class GenericListSortProcessor<E extends Collection<E>> {

	public static void main(String[] args) {

		Integer[] aList = { 1, 2, 3, 4, 5, 6, 6, 5, 7, 3, 6, 3, 7, 3, 2, 2, 6,7, 0 };
		System.out.print("UnSorterd List :: ");
		for(Number bList :  aList  ){
			System.out.print(" "+bList);
		}
		System.out.println();

		selectionSort(aList);

		System.out.print("Sorterd List   :: ");
		for(Number bList :  aList  ){
			System.out.print(" "+bList);
		}
	}

	private static <E> void swap(E[] a, int i, int j) {
		if (i != j) {
			E temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
	}

	public static <E extends Comparable<E>> void selectionSort(E[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			// find index of smallest element
			int smallest = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j].compareTo(a[smallest]) <= 0) {
					smallest = j;
				}
			}

			swap(a, i, smallest); // swap smallest to front
		}
	}

}
