/*
https://www.geeksforgeeks.org/problems/search-pattern0205/1

Search Pattern (KMP-Algorithm)

Given two strings, one is a text string txt and the other is a pattern string pat.
The task is to print the indexes of all the occurrences of the pattern string in the text string. Use 0-based indexing while returning the indices. 
Note: Return an empty list in case of no occurrences of pattern.

Examples :

Input: txt = "abcab", pat = "ab"
Output: [0, 3]
Explanation: The string "ab" occurs twice in txt, one starts at index 0 and the other at index 3.
Input: txt = "abesdu", pat = "edu"
Output: []
Explanation: There's no substring "edu" present in txt.


-------------------------------------------- code --------------------------------------------------

// Knuth-Morris-Pratt (KMP) algorithm.

class Solution {

    ArrayList<Integer> search(String pat, String txt) {
        ArrayList<Integer> result = new ArrayList<>();
        
        
        int[] lps = new int[pat.length()];
        computeLPSArray(pat, lps);
        int i = 0;
        int j = 0;
        
        while (i < txt.length()) {
            if (pat.charAt(j) == txt.charAt(i)) {
                i++;
                j++;
            }
            
            if (j == pat.length()) {
                result.add(i - j);
                j = lps[j - 1];
            } else if (i < txt.length() && pat.charAt(j) != txt.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        
        return result;
    }

    private void computeLPSArray(String pat, int[] lps) {
        int len = 0;
        int i = 1;
        
        while (i < pat.length()) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }
}

*/