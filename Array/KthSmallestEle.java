// DSA - Java program given an integer k and an array of size n consisting of unique integers.
// Find the kth smallest element in this array.

import java.util.*;

public class KthSmallestEle {
    public static int KthSmallestElement(int arr[], int n, int k) {

        // sorting the array
        Arrays.sort(arr);

        // return kth smallest element
        return arr[k - 1];
    }

    public static void main(String[] args) {
        int arr[] = { 50, 10, 75, 55, 45 };
        int n = arr.length;
        int k = 2;
        int x = KthSmallestElement(arr, n, k);
        System.out.print("Kth smallest element is " + x);
    }
}
