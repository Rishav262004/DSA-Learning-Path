/*

https://leetcode.com/problems/convert-a-number-to-hexadecimal/description/

Given a 32-bit integer num, return a string representing its hexadecimal representation.
For negative integers, two’s complement method is used.

All the letters in the answer string should be lowercase characters, and there should not
be any leading zeros in the answer except for the zero itself.

Note: You are not allowed to use any built-in library method to directly solve this problem.

Example 1:

Input: num = 26
Output: "1a"
Example 2:

Input: num = -1
Output: "ffffffff"

------------------------------------------ CODE -----------------------------------------------------------------------

class Solution {
    public String toHex(int num) {
        // Handle the case for zero
        if (num == 0) {
            return "0";
        }

        StringBuilder hexString = new StringBuilder();
        // Lookup table for hex characters
        char[] hexChars = "0123456789abcdef".toCharArray();

        // Process the number (32 bits = 8 hex digits)
        for (int i = 0; i < 8 && num != 0; i++) {
            // Extract the last 4 bits and map them to hex
            int hexDigit = num & 0xF;
            hexString.append(hexChars[hexDigit]);
            num >>>= 4; // Right shift by 4 bits
        }

        // Reverse the string since we built it from the least significant digit
        return hexString.reverse().toString();
    }
}


*/