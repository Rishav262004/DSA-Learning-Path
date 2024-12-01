/*

https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/submissions/1467268123/

Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, 
or -1 if needle is not part of haystack.

---------------------------------------- code --------------------------------------

class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        
        int hayLen = haystack.length();
        int needleLen = needle.length();

        if (needleLen > hayLen) {
            return -1;
        }

        
        for (int i = 0; i <= hayLen - needleLen; i++) {
            boolean found = true;
            for (int j = 0; j < needleLen; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    found = false;
                    break;
                }
            }
            
            if (found) {
                return i;
            }
        }
        return -1;
    }
}

*/