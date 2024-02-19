// DSA - Java program given an integer k and an array of size n consisting of unique integers.
// Find the kth largest element in this array.

import java.util.*;

public class KthLargeEle {

    public static int KthLargestElement(int arr[], int n, int k) {

        // sorting the array
        Arrays.sort(arr);

        // return kth largest element
        return arr[n - k];
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 4, 6, 3, 9, 7 };
        int n = arr.length;
        int k = 2;
        int x = KthLargestElement(arr, n, k);
        System.out.print("Kth largest element is " + x);
    }
}
