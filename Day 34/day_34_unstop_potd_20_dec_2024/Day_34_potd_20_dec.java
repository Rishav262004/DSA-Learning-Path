/*

https://unstop.com/code/practice/301956

Lexi is a young girl who loves eating candies. Each day, her mother gives her a varying amount of money.In her neighborhood,
there are N shops, and each shop sells candy at a different price, denoted as Xi for the ith shop. Over the next M days, 
you need to determine how many options Lexi has for buying candies each day based on the amount of money she has.

Input Format
The first line contains an integer N, representing the number of shops.
The second line consists of N space-separated integers, where the ith integer, Xi, indicates the price of candy at each shop.
The third line contains an integer M, which indicates the number of days.
Following this, each of the next M lines contains an integer mi, representing the number of coins Lexi has on the ith day.

Output Format
For each day print in a new line the number of options she will have to buy candies.

Constraints
1 ≤ N ≤ 10^5
1 ≤ xi ≤ 10^5
1 ≤ M ≤ 10^5
1 ≤ mi ≤ 10^9

Sample Testcase 0
Testcase Input
6
1 3 7 10 14 9
5
2
6
9
12
5
Testcase Output
1
2
4
5
2
Explanation
For sample 1, on the first day, she has 2 coins so she can only buy from the 1st shop.
On the second day, she has 6 coins so, she can buy candy from the 1st and 2nd shops.
On the third day, she has 9 coins so, she can buy only from the 1st, 2nd, 3rd, and 6th shops.
On the fourth day, she has 12 coins, so she can buy from all the shops, except the 5th shop.
On the fifth day, she has 5 coins she can buy from 1st and 2nd shop only.
Sample Testcase 1
Testcase Input
10
4 3 6 8 23 45 65 12 32 16
5
23
12
54
24
23
Testcase Output
7
5
9
7
7
Explanation
On the first day, she has 23 coins so she can only buy from the 1st, 2nd, 3rd, 4th, 5th, 8th and 10th shop.


On the second day, she has 12 coins so, she can buy candy from the 1st, 2d, 3rd, 4th, and 8th shops.


Similarly for all other days.

--------------------------------------------------------  CODE ---------------------------------------------------------

import java.util.*;

public class Main {
    public static List<Integer> number_of_options(int n, long[] prices, int m, int[] coins_per_day) {
        
        Arrays.sort(prices);
        List<Integer> result = new ArrayList<>();

        
        for (int coins : coins_per_day) {
            
            int affordableShops = binarySearch(prices, coins);
            result.add(affordableShops);
        }

        return result;
    }

    
    private static int binarySearch(long[] prices, int coins) {
        int low = 0, high = prices.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (prices[mid] <= coins) {
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }
        return low; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int n = sc.nextInt();
        long[] prices = new long[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextLong();
        }

        int m = sc.nextInt();
        int[] coins_per_day = new int[m];
        for (int i = 0; i < m; i++) {
            coins_per_day[i] = sc.nextInt();
        }

        
        List<Integer> result = number_of_options(n, prices, m, coins_per_day);
        for (int res : result) {
            System.out.println(res);
        }
    }
}

*/