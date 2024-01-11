// DSA - java program to reverse an array

import java.util.*;

public class RevArray {
    public static int[] revArr(int arr[], int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input to get the size of array
        System.out.print("Enter size of the array:" + " ");
        int size = sc.nextInt();

        // declare and initialize an array
        int[] arr = new int[size];

        // user input to get the array elements separated by space
        System.out.print("Enter array elements:" + " ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Reversing the array
        revArr(arr, 0, size - 1);

        // Print the reversed array
        System.out.print("Reversed array:" + " ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
