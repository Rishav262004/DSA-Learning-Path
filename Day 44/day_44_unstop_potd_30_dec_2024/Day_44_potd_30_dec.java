/*

https://unstop.com/code/practice/293472

John and Davis are playing a game with ( N ) distinct coins, each numbered from 1 to ( N ).
John challenges Davis to place the coins in a straight line. The challenge is that any coin with a number
( P ) that satisfies the equation 1*2*3*...*(p-1)+1 is divisible by ( P ) must be placed at a prime position in the line.
Davis is confused and needs help to find the number of ways to arrange the coins.

Note: If the number of ways is large, take the result modulo (10^9 + 7).

Input Format
The first line consists of an integer ( N ) which denotes the number of coins.

Output Format
Print a single line consisting of an integer that shows the number of ways that are possible.

Constraints
1 <= N <= 10^6

Sample Testcase 0
Testcase Input
5
Testcase Output
12
Explanation
Explanation for sample case 1:
For example [1,2,5,4,3] is a valid way, but [5,2,3,4,1] is not because the prime number 5 is at index 1.
Sample Testcase 1
Testcase Input
8
Testcase Output
576
Explanation
One such valid way is [1,2,3,4,5,6,7,8], and there are many more.

-------------------------------------------------- CODE ----------------------------------------------------------------

import java.io.*;
import java.util.*;

class Main {
    static final int MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        // Step 1: Sieve of Eratosthenes to count primes
        boolean[] isPrime = new boolean[N + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false; // 0 and 1 are not prime

        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int primeCount = 0;
        for (int i = 1; i <= N; i++) {
            if (isPrime[i]) primeCount++;
        }

        // Step 2: Precompute factorials and modular inverses
        long[] fact = new long[N + 1];
        fact[0] = 1;
        for (int i = 1; i <= N; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }

        // Step 3: Calculate the result
        long result = (fact[primeCount] * fact[N - primeCount]) % MOD;
        System.out.println(result);
    }
}

*/