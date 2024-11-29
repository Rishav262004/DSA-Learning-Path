/*

https://leetcode.com/problems/add-binary/description/


Given two binary strings a and b, return their sum as a binary string.

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"


----------------------------------------------- code ------------------------------------------------

class Solution {
    public String addBinary(String s1, String s2) {
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        StringBuilder result = new StringBuilder();
        int carry = 0;
        
        while (i >= 0 || j >= 0 || carry != 0) {
            int bit1 = (i >= 0) ? s1.charAt(i) - '0' : 0;
            int bit2 = (j >= 0) ? s2.charAt(j) - '0' : 0;
            int sum = bit1 + bit2 + carry;
            carry = sum / 2;
            result.append(sum % 2);
            i--;
            j--;
        }
        String res = result.reverse().toString();
        int idx = 0;
        while (idx < res.length() - 1 && res.charAt(idx) == '0') {
            idx++;
        }
        return res.substring(idx);
    }
}

*/