/*

https://leetcode.com/problems/count-primes/description/

Given an integer n, return the number of prime numbers that are strictly less than n.

Example 1:

Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
Example 2:

Input: n = 0
Output: 0
Example 3:

Input: n = 1
Output: 0

------------------------------------------------------------ CODE ------------------------------------------------------
class Solution {

    // Sieve of Eratosthenes algorithm
    public int countPrimes(int n) {
        if (n <= 1) {
            return 0;
        }
        
        // Create a boolean array to mark prime numbers
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true; // Assume all numbers are prime initially
        }
        
        // Apply the Sieve of Eratosthenes
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                // Mark multiples of i as non-prime
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        // Count prime numbers
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        
        return count;
    }
}


*/