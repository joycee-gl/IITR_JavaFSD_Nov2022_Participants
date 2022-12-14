package com.greatlearning.driver;
import java.util.Scanner;

import com.greatlearning.arrayRotation.*;
import com.greatlearning.mergeSort.*;
import com.greatlearning.modifiedBinarySearch.*;

class ArrayOperationsMain {

	// main function
	public static void main(String args[]) {

		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("enter the " + size + " elements");
		int array[] = new int[size];
		
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}

		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(array, 0, array.length - 1);

		System.out.println("the Array after sorting is ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		int midElement = array.length / 2;

		ArrayRotation arrayRotation = new ArrayRotation();

		arrayRotation.leftRotate(array, midElement, array.length);

		System.out.println("the Array after rotation is ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("enter the key ");
		int key = sc.nextInt();
		ModifiedBinarySearch pivotedBinarySearch = new ModifiedBinarySearch();
		int index = pivotedBinarySearch.pivotedBinarySearch(array, array.length, key);
		
		System.out.println((index>0) ? "key is present at position: " +index : "element not found");
		sc.close();
	}
}
