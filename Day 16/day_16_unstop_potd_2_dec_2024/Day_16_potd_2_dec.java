/*

https://unstop.com/code/practice/294135

Alice will choose a number between 1 to N inclusive. Your task is to predict the number that Alice chose. If you predict the number correctly, you will be rewarded. However, if your prediction is wrong, Alice will tell you whether the number she chose is greater or smaller than your prediction, and you will keep predicting until you find the number. For each wrong prediction number K, you will give K coins to Alice.

You are given the number N.

Your task is to return the minimum coins you should have to be rewarded by Alice, no matter what number she chooses.

Input Format
The first and only line will contain a single integer N.

Output Format
Print an integer denoting the minimum coins you should have.

Constraints
1 ≤ N ≤ 200

Sample Testcase 0
Testcase Input
2
Testcase Output
1
Explanation
Alice can choose either 1 or 2. If we predict 1, which matches Alice’s number, then no coins need to be paid. Otherwise, we have to pay 1 coin. Even if Alice's number is greater, then it must be 2. We can predict 2 by paying only 1 coin. So, we have to pay only 1 coin in the worst-case scenario.
Sample Testcase 1
Testcase Input
10
Testcase Output
16

------------------------------------------- code -----------------------------------------------------


import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the input
        int N = sc.nextInt();

        // Define a memoization table for dynamic programming
        int[][] dp = new int[N + 1][N + 1];

        // Call the helper function to calculate the minimum coins required
        System.out.println(minCoins(dp, 1, N));
    }

    // Helper function to calculate the minimum coins required
    public static int minCoins(int[][] dp, int start, int end) {
        if (start >= end) return 0; // Base case: No cost if the range is 1 or invalid
        
        if (dp[start][end] != 0) return dp[start][end]; // Return memoized value if already computed

        int minCost = Integer.MAX_VALUE;

        // Try every possible number as the first guess
        for (int i = start; i <= end; i++) {
            int cost = i + Math.max(minCoins(dp, start, i - 1), minCoins(dp, i + 1, end));
            minCost = Math.min(minCost, cost);
        }

        dp[start][end] = minCost; // Store the result in the memoization table
        return minCost;
    }
}


 */