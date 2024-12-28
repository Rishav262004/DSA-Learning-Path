/*

https://unstop.com/code/practice/261198

There are N people in a village who are standing in a line, each represented by a positive number. You need to determine if it is possible to select a subset of these people such that the sum of their numbers equals to the given village number K.

Note : You can take each number atmost 1 time.

Input Format
The first line of input contains two integers: N the number of people, and K, the village number.
The second line of input contains N space-separated positive integers ,representing the numbers assigned to each person.
Output Format
Display a single string either “YES” or “NO” representing whether it is possible to select people based on the condition. 
Constraints
1 ≤ | N | ≤ 10^2
1 ≤ | K | ≤ 104
1 ≤ | Arr[i] | ≤ 10^2
Sample Testcase 0
Testcase Input
6 9
3 34 4 12 5 2
Testcase Output
YES
Explanation
There is a subset (4, 5) with sum 9.
Sample Testcase 1
Testcase Input
6 30
3 34 4 12 5 2
Testcase Output
NO
Explanation
There's no subset that adds upto 30.

--------------------------------------------- CODE ---------------------------------------------------------------------

import java.util.*;

public class Main {
    public static void canSelectPeople(int N, int K, int[] arr) {
        
        boolean[] dp = new boolean[K + 1];

        dp[0] = true;

        for (int num : arr) {
            for (int j = K; j >= num; j--) {
                if (dp[j - num]) {
                    dp[j] = true;
                }
            }
        }

        System.out.println(dp[K] ? "YES" : "NO");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        canSelectPeople(N, K, arr);
    }
}


*/