//DSA - Java program to find and print the index of the key found in the rotated sorted array 
//using linear search

import java.util.*;

public class SearchRotatedArray {
	public static int searchRotatedArray(int[] arr, int key) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = { 5, 6, 7, 8, 1, 2, 3, 4 };
		System.out.print("Enter the key to be found:" + " ");
		int key = sc.nextInt();

		// print the index of the key found
		int index = searchRotatedArray(arr, key);
		if (index != -1) {
			System.out.println("The key is found at index " + index);
		} else {
			System.out.println("Key not found");
		}
		sc.close();
	}
}
