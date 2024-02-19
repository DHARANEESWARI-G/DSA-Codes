// DSA - Java program to print the duplicate elements in an array if any

import java.util.*;

public class ContainsDupli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // user input
        System.out.print("Enter array size:" + " ");
        int arr_size = sc.nextInt();

        // Declare the array
        int[] arr = new int[arr_size];

        System.out.print("Enter the array elements:" + " ");

        // Get array elements from user in the new line
        for (int i = 0; i < arr_size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Duplicate elements in given array: ");
        // Searches for duplicate element
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.print(arr[j] + " ");

            }
        }
        sc.close();
    }
}