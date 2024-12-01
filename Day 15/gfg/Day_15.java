/*
https://www.geeksforgeeks.org/problems/non-repeating-character-1587115620/1

Given a string s consisting of lowercase Latin Letters. Return the first non-repeating character in s. If there is no non-repeating character, return '$'.
Note: When you return '$' driver code will output -1.

Examples:

Input: s = "geeksforgeeks"
Output: 'f'
Explanation: In the given string, 'f' is the first character in the string which does not repeat.

-------------------------------------------------- CODE --------------------------------------------

class Solution {
    
    static char nonRepeatingChar(String s) {
        int l = s.length();

        for (int i = 0; i < l; i++) {
            char a = s.charAt(i);
            boolean isUnique = true;
            

            for (int j = 0; j < l; j++) {
                if (i != j && s.charAt(j) == a) {
                    isUnique = false;
                    break;

                    }
            }
            

            if (isUnique) {
                return a;
            }
        }

        return '$';
    }
}

    

*/