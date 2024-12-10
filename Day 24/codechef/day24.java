/*

https://www.codechef.com/practice/course/number-theory/INTNT01/problems/APPLEORANGE


Apples and oranges

-------------------------------------------------  CODE ----------------------------------------------


import java.util.*;

class Solution {
    // Function to compute GCD using the Euclidean algorithm
    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        StringBuilder result = new StringBuilder();

        for (int t = 0; t < T; t++) {
            long N = sc.nextLong();
            long M = sc.nextLong();
            result.append(gcd(N, M)).append("\n");
        }

        System.out.print(result);
    }
}

 */