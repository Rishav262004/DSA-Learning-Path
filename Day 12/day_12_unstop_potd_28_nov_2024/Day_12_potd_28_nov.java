/*

https://unstop.com/code/practice/293637

Triple Subsequence

You are given an array Arr of size N.
Your task is to find the length of the longest subsequence such that each element in the subsequence is exactly three times the previous element.

Input Format
The first line of input contains a single integer N ,representing the size of the array Arr.

The second line of input contains N integers,representing  the elements of the array Arr.

Output Format
Print a single number representing the maximum length of the subsequence satisfying the condition.

Constraints
1 <= N<= 10^2

0 <= Arr[i] <= 2*10^3

Sample Testcase 0
Testcase Input
3
1 2 3
Testcase Output
2
Explanation
Consider subsequence {1, 3} here 3 is triple of 1. Hence the answer is 2.
Sample Testcase 1
Testcase Input
4
2 3 6 18
Testcase Output
3
Explanation
Consider the subsequence {2, 6, 18}. Here 6 is a triple of 2, and 18 is a triple of 6. Hence the answer is 3.


\
import java.util.*;

class Main {
    public static long solve(List<Long> arr) {
        int n = arr.size();
        long[] dp = new long[n];
        Arrays.fill(dp, 1); 
        
        long maxLength = 1;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) == 3 * arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLength = Math.max(maxLength, dp[i]);
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Long> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextLong());
        }
        System.out.println(solve(arr));
    }
}

 */