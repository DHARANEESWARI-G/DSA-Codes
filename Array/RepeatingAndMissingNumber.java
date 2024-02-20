// DSA - Java program to print the missing and repeating number in the given array input

import java.util.*;

public class RepeatingAndMissingNumber {
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

        int sum = 0, sumSq = 0;
        int sumOfN = (n * (n + 1)) / 2; // Sum of N natural numbers
        int sumOfSqN = (n * (n + 1) * (2 * n + 1)) / 6; // Sum of Square of N natural numbers
        for (int i = 0; i < n; i++) {
            sum += arr[i]; // Sum of the numbers in the array
            sumSq += arr[i] * arr[i]; // Sum of the square of the numbers in the array
        }
        int v1 = sum - sumOfN; // x-y
        int v2 = sumSq - sumOfSqN;
        v2 = v2 / v1; // x+y = v2/x-y
        int x = (v1 + v2) / 2;
        int y = x - v1;
        System.out.println("Repeating number: " + x);
        System.out.print("Missing number: " + y);
        sc.close();

    }
}