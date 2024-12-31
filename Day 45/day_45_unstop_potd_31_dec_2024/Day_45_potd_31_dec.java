/*

https://unstop.com/code/practice/293607

You are given an integer N, and your objective is to count the number of strings of 
length N that can be generated according to the following rules and convert this count to its octal representation.

The strings consist of lowercase vowels only ('a', 'e', 'i', 'o', 'u') and must 
follow the rules below for valid transitions between vowels:

'e' and 'u' can come after 'a'.
'i' and 'a' can come after 'e'.
'o' and 'e' can come after 'i'.
'u' and 'i' can come after 'o'.
'a' and 'o' can come after 'u'.
Note: If N is 0 or if no valid strings can be formed for the given N, Display 1.

Since the answer may be large, therefore output with mod 10^9+7.

Input Format
The first line of input contains a single integer N representing the length of the string.

Output Format
Display the octal representation of the number of valid strings of length N.

Constraints
1 <= N <= 2 * 10^6
Sample Testcase 0
Testcase Input
1
Testcase Output
5
Explanation
All possible strings are: "a," "e," "i," "o," and "u."
Sample Testcase 1
Testcase Input
2
Testcase Output
12
Explanation
10 possible strings are: "ae", "au", "ei", "ea", "ie", "io", "oi", "ou", "uo" and "ua". 10 to octal is 12.

------------------------------------------------------ CODE ------------------------------------------------------------

import java.util.Scanner;

public class Main {
    public static String userLogic(int n) {
        final int MOD = 1000000007;

        // Base case: If N == 0, return 1 as per the problem statement
        if (n == 0) {
            return "1";
        }

        // Initialize transitions for each vowel
        int[][] transitions = {
            {1, 4}, // 'a' -> 'e', 'u'
            {0, 2}, // 'e' -> 'a', 'i'
            {1, 3}, // 'i' -> 'e', 'o'
            {2, 4}, // 'o' -> 'i', 'u'
            {0, 3}  // 'u' -> 'a', 'o'
        };

        // Current and next states
        long[] curr = new long[5];
        long[] next = new long[5];

        // Base case: All vowels are valid for strings of length 1
        for (int i = 0; i < 5; i++) {
            curr[i] = 1;
        }

        // Update DP states for length 2 to N
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i < 5; i++) {
                next[i] = 0;
                for (int t : transitions[i]) {
                    next[i] = (next[i] + curr[t]) % MOD;
                }
            }

            // Swap current and next arrays
            long[] temp = curr;
            curr = next;
            next = temp;
        }

        // Sum up all valid strings of length N
        long result = 0;
        for (int i = 0; i < 5; i++) {
            result = (result + curr[i]) % MOD;
        }

        // Convert the result to octal and return
        return Long.toOctalString(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        // Call user logic function and print the output
        String result = userLogic(n);
        System.out.println(result);
    }
}

*/