// DSA - Java program to find the minimum and maximum elements in the array

import java.util.*;

public class MinMax {
    // func for max element
    public int max(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // func for min element
    public int min(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // user input
        System.out.println("Enter array size:");
        int arr_size = sc.nextInt();

        // Declare and initialize the array
        int[] arr = new int[arr_size];

        System.out.println("Enter the array elements:");

        // Get array elements from user in the new line
        for (int i = 0; i < arr_size; i++) {
            arr[i] = sc.nextInt();
        }

        // Create an instance of the MinMax class
        MinMax m = new MinMax();

        // print the min and max elements
        System.out.println("Maximum element in the array: " + m.max(arr));
        System.out.println("Minimum element in the array: " + m.min(arr));
        sc.close();
    }
}