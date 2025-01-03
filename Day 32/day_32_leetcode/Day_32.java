/*

https://leetcode.com/problems/power-of-three/description/


Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three, if there exists an integer x such that n == 3x.

Example 1:

Input: n = 27
Output: true
Explanation: 27 = 33
Example 2:

Input: n = 0
Output: false
Explanation: There is no x where 3x = 0.
Example 3:

Input: n = -1
Output: false
Explanation: There is no x where 3x = (-1).

Constraints:

-231 <= n <= 231 - 1

Follow up: Could you solve it without loops/recursion?

-------------------------------------- CODE ---------------------------------------

class Solution {
    public boolean isPowerOfThree(int n) {
        // The largest power of three that fits in a 32-bit signed integer
        int largestPowerOfThree = 1162261467; // 3^19
        return n > 0 && largestPowerOfThree % n == 0;
    }
}

 */