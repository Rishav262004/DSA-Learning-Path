/*

https://www.geeksforgeeks.org/problems/check-if-strings-are-rotations-of-each-other-or-not-1587115620/1

Strings Rotations of Each Other

You are given two strings of equal lengths, s1 and s2. The task is to check if s2 is a rotated version of the string s1.

Note: The characters in the strings are in lowercase.

Examples :

Input: s1 = "abcd", s2 = "cdab"
Output: true
Explanation: After 2 right rotations, s1 will become equal to s2.
Input: s1 = "aab", s2 = "aba"
Output: true
Explanation: After 1 left rotation, s1 will become equal to s2.
Input: s1 = "abcd", s2 = "acbd"
Output: false
Explanation: Strings are not rotations of each other.

------------------------------------------------- code -----------------------------------------------------

1. Brute force

class Solution {

    public static boolean areRotations(String s1, String s2) {
        int length = s1.length();
        

        if (length != s2.length()) {
            return false;
        }

        // Check all rotations
        for (int i = 0; i < length; i++) {

            String rotated = s1.substring(i) + s1.substring(0, i);
            if (rotated.equals(s2)) {
                return true;
            }
        }
        
        return false;
    }
}

2. Brute force optimised

class Solution {
    
    public static boolean areRotations(String s1, String s2) {
        
        if (s1.length() != s2.length()) {
            return false;
        }
        
        String concatenated = s1 + s1;
        
        return concatenated.contains(s2);
    }
}

3. Optimised

class Solution {
    
    public static boolean areRotations(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        int n = s1.length();

        int[] lps = computeLPSArray(s2);
        int i = 0;
        int j = 0;
        int len = 2 * n;
        while (i < len) {
            if (s1.charAt(i % n) == s2.charAt(j)) {
                i++;
                j++;
                if (j == n)
                    return true;
            } else {
                if (j != 0) {
                    j = lps[j -1];
                } else {
                    i++;
                }
            }
        }
        return false;
    }
    
    public static int[] computeLPSArray(String pat) {
        int n = pat.length();
        int[] lps = new int[n];
        int len = 0;
        lps[0] = 0;
        int i = 1;
        while (i < n) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len -1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}

*/
