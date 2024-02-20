// DSA - Java program to print the next permutation of the array input

// problem statement: Given an array arr[] of size n, print the lexicographically 
// next greater permutation of the given array. If there does not exist any greater permutation, 
// then print the lexicographically smallest permutation of the given array.

import java.util.*;

public class NextPermutation {

    // func to find the next permutation
    public static void nextPermutation(int[] arr) {
        if (arr == null || arr.length <= 1)
            return;

        int n = arr.length, i, j;
        // Find the pivot element, which is the point the array is in non-increasing
        // order
        for (i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                break;
            }
        }

        // If pivot is not found, reverse the whole array
        if (i < 0) {
            reverse(arr, 0, arr.length - 1);
            return;
        }

        // If pivot is found, find the rightmost greatest number in the non-increasing
        // suffix
        else {
            for (j = n - 1; j > i; j--) {
                if (arr[j] > arr[i]) {
                    break;
                }
            }
        }

        // Swap the pivot element with the rightmost greatest number in the suffix part
        swap(arr, i, j);

        // Reverse the sub-array(suffix) to the right of the pivot
        reverse(arr, i + 1, arr.length - 1);
    }

    // Method to swap elements in the array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Method to reverse the sub-array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start++, end--);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input to get the size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Initializing an array of size n
        int[] arr = new int[n];

        // User input to get the array elements of size n
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // func call
        nextPermutation(arr);

        // Display the next permutation of the array
        for (int array : arr) {
            System.out.print(array + " ");
        }
        sc.close(); // Closing scanner
    }
}
