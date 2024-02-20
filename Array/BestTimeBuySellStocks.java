import java.util.*;

public class BestTimeBuySellStocks {
    static int buySellStocks(int price[]) {

        if (price == null || price.length == 0) {
            return 0;
        }
        int profit = 0;
        int bp = Integer.MAX_VALUE; // bp --> buying price
        for (int i = 0; i < price.length; i++) {
            if (price[i] <= bp) {
                bp = price[i];
                continue;
            }
            profit = Math.max(profit, price[i] - bp);
        }
        return profit;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input to get the size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Initializing an array of size n
        int[] price = new int[n];

        // User input to get the array elements of size n
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }
        int ans = buySellStocks(price);
        System.out.println("The maximum profit is: " + ans);
        sc.close();
    }
}
