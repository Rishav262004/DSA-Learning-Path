/*


https://leetcode.com/problems/find-the-key-of-the-numbers/


You are given three positive integers num1, num2, and num3.

The key of num1, num2, and num3 is defined as a four-digit number such that:

Initially, if any number has less than four digits, it is padded with leading zeros.
The ith digit (1 <= i <= 4) of the key is generated by taking the smallest digit among the ith digits of num1, num2, and num3.
Return the key of the three numbers without leading zeros (if any).

 

Example 1:

Input: num1 = 1, num2 = 10, num3 = 1000

Output: 0

Explanation:

On padding, num1 becomes "0001", num2 becomes "0010", and num3 remains "1000".

The 1st digit of the key is min(0, 0, 1).
The 2nd digit of the key is min(0, 0, 0).
The 3rd digit of the key is min(0, 1, 0).
The 4th digit of the key is min(1, 0, 0).
Hence, the key is "0000", i.e. 0.

Example 2:

Input: num1 = 987, num2 = 879, num3 = 798

Output: 777

Example 3:

Input: num1 = 1, num2 = 2, num3 = 3

Output: 1

------------------------------------------------- CODE -----------------------------------------------------------------

class Solution {
    public int generateKey(int num1, int num2, int num3) {
        // Convert numbers to padded strings
        String str1 = String.format("%04d", num1);
        String str2 = String.format("%04d", num2);
        String str3 = String.format("%04d", num3);
        
        // Build key by finding minimum digit at each position
        StringBuilder key = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int digit1 = str1.charAt(i) - '0';
            int digit2 = str2.charAt(i) - '0';
            int digit3 = str3.charAt(i) - '0';
            
            int minDigit = Math.min(Math.min(digit1, digit2), digit3);
            key.append(minDigit);
        }
    
        return Integer.parseInt(key.toString());
    }
}
*/