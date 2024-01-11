// DSA = java program to print the maximum sum of the subarray in the given array 
//using kadane's algorithm

import java.util.*;

public class MaxSumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // user input to size of the array
        System.out.print("Enter the size of the array:" + " ");
        int size = sc.nextInt();
        // declare and initialize an array
        int[] arr = new int[size];

        // user input to get the array elements separated by space
        System.out.print("Enter array elements:" + " ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + arr[i];
            if (max < sum) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println("The maximum sum in the subarray:" + max);

    }

}
