/*

https://unstop.com/code/practice/300468


You are given a binary string s consisting of N characters, each of which is either '0' or '1'.

You can perform the following operation any number of times:

Choose two adjacent digits in the string and swap them to make the string lexicographically larger.
For example, if s is "101", you can perform the following sequence of operations to make it the maximum possible value: 110 (swap the last two digits)
What is the minimum number of operations required to make “s” the maximum possible value?

Input Format
The first line of the input contains a single integer N, the length of the binary string.

The second line contains the binary string s of length N.

It is guaranteed that “s” consists only of the characters '0' and '1'.

Output Format
Output a single integer, the minimum number of operations required to make the “s” maximum possible value.

Constraints
1 <= N <= 10^5

Sample Testcase 0
Testcase Input
4
1111
Testcase Output
0
Explanation
In this example, the input string is already the maximum possible value, so no swaps are needed.

Sample Testcase 1
Testcase Input
4
1101
Testcase Output
1
Explanation
In this example, we can get the maximum possible value by swapping the last two characters of the string, so only 1 swap is needed.
 */

// Answer : 
/*

import java.util.Scanner;

public class Main {
    
    public static int min_operations_to_maximize(int n, String s) {
        int zeroCount = 0;
        int swaps =0;
        
        // Traverse through the string
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                
                zeroCount++;
            } else {
                
                swaps += zeroCount;
            }
        }
        
        return swaps;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        scanner.close();

        int result = min_operations_to_maximize(n, s);
        System.out.println(result);
    }
}

*/