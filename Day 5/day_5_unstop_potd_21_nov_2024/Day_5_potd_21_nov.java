/*

Jack is given a string S of length N. Bob provides Jack with a query string "query" of length M. Jack wants to determine how many times Bob's query appears as a subsequence in his string S.

Help Jack count the number of times Bob's query can be found as a subsequence in the string S.

Note: The characters in the subsequence must appear in the same order as they are in the query string when choosing them from string S.



Testcase Input
competitive ti
Testcase Output
3

https://unstop.com/code/practice/261231


import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] parts = input.split(" ");
        String s1 = parts[0]; 
        String s2 = parts[1]; 

        int n = s1.length(); 
        int m = s2.length(); 

        long[][] dp = new long[n + 1][m + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;  
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        System.out.println(dp[n][m]);

    }
}


*/