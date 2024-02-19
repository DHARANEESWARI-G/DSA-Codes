// DSA - Java program for Chocolate Distribution problem

// problem statement: packets containing varying number of chocolates and m number of students given as input
// the packets must be selected for m students such that the difference between 
//the number of chocolates in the packet with maximum chocolates 
// and the packet with minimum chocolates given to the students is minimum.

import java.util.*;

public class ChocoDistri {

    // function to find the minimum difference between the chocolates in the chosen
    // packets subarray
    static int findMinDiff(int arr[], int m) {

        // checking base cases
        // if there are no pactets and no students
        if (arr.length == 0 || m == 0) {
            return 0;
        }

        // sorting the array to obtain the subarray easily
        Arrays.sort(arr);

        // checking invalid input
        // if there are no sufficent packets for all the students
        if (arr.length < m) {
            return -1;
        }

        // initializing a max value to the min_diff variable
        int min_diff = Integer.MAX_VALUE;

        // finding minimum difference between the chocolates in the packets chosen
        for (int i = 0; i + m - 1 < arr.length; i++) {
            int diff = arr[i + m - 1] - arr[i];

            // updating minimum difference
            if (diff < min_diff) {
                min_diff = diff;
            }
        }
        return min_diff;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // user input to get the size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // initializing and declaring an array of size n
        int arr[] = new int[n];

        // user input to the array values(number of chocolates per packet)
        System.out.print("Enter the array elememts of size n: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // user input to get the number of students/children
        System.out.print("Enter the number of students: ");
        int m = sc.nextInt();

        // printing the minimum difference
        System.out.println("Minimum difference of chocolates: " + findMinDiff(arr, m));
        sc.close(); // closing scanner
    }

}
