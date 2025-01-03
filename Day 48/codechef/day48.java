/*

https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/SUGARCANE

Sugarcane Juice Business

--------------------------------------------------------------- CODE ------------------------------------------------------------

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int T = sc.nextInt();
        int[] results = new int[T];

        // Process each test case
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); // Number of glasses of sugarcane juice sold

            // Calculate total income
            int totalIncome = 50 * N;

            // Calculate total expenses
            int sugarcaneCost = (20 * totalIncome) / 100;
            int saltAndMintCost = (20 * totalIncome) / 100;
            int rentCost = (30 * totalIncome) / 100;
            int totalExpenses = sugarcaneCost + saltAndMintCost + rentCost;

            // Calculate profit
            int profit = totalIncome - totalExpenses;

            // Store the result
            results[t] = profit;
        }

        // Print all results
        for (int profit : results) {
            System.out.println(profit);
        }

    }
}

*/