/*

https://leetcode.com/problems/alternating-digit-sum/submissions/1476484157/
        
You are given a positive integer n. Each digit of n has a sign according to the following rules:

The most significant digit is assigned a positive sign.
Each other digit has an opposite sign to its adjacent digits.
Return the sum of all digits with their corresponding sign.

 

Example 1:

Input: n = 521
Output: 4
Explanation: (+5) + (-2) + (+1) = 4.
Example 2:

Input: n = 111
Output: 1
Explanation: (+1) + (-1) + (+1) = 1.
Example 3:

Input: n = 886996
Output: 0
Explanation: (+8) + (-8) + (+6) + (-9) + (+9) + (-6) = 0.
 

----------------------------------------------- CODE --------------------------------------------------------

class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0;
        int sign = 1;
        int digits = (int) Math.log10(n) + 1;
        sign = (digits % 2 == 0) ? -1 : 1;

        while (n > 0) {
            int digit = n % 10;
            sum += sign * digit;
            sign *= -1;
            n /= 10;
        }

        return sum;
    }
}

 */