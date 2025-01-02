/*


https://leetcode.com/problems/valid-parentheses/description/

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

------------------------------------------------- CODE -----------------------------------------------------------------
class Solution {
    public boolean isValid(String s) {
        // Stack to store the opening brackets
        Stack<Character> stack = new Stack<>();
        
        // Iterate through the string
        for (char ch : s.toCharArray()) {
            // If the character is an opening bracket, push it onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                // If it's a closing bracket, check if the stack is non-empty and if it matches the top of the stack
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        // If the stack is empty, all brackets are matched correctly
        return stack.isEmpty();
    }
}


------------------------------------------------------------------------ POTD JAN 1 ------------------------------------------------------------------------

https://leetcode.com/problems/maximum-score-after-splitting-a-string/description/?envType=daily-question&envId=2025-01-01

Given a string s of zeros and ones, return the maximum score after splitting the string into two non-empty substrings (i.e. left substring and right substring).

The score after splitting a string is the number of zeros in the left substring plus the number of ones in the right substring.

 

Example 1:

Input: s = "011101"
Output: 5 
Explanation: 
All possible ways of splitting s into two non-empty substrings are:
left = "0" and right = "11101", score = 1 + 4 = 5 
left = "01" and right = "1101", score = 1 + 3 = 4 
left = "011" and right = "101", score = 1 + 2 = 3 
left = "0111" and right = "01", score = 1 + 1 = 2 
left = "01110" and right = "1", score = 2 + 1 = 3
Example 2:

Input: s = "00111"
Output: 5
Explanation: When left = "00" and right = "111", we get the maximum score = 2 + 3 = 5
Example 3:

Input: s = "1111"
Output: 3

----------------------------------------------------------------------------- CODE -----------------------------------------------------------------------

class Solution {
    public int maxScore(String s) {
        int leftZeros = 0, rightOnes = 0;
        int maxScore = 0;
        
        // Calculate the total number of ones in the string
        for (char c : s.toCharArray()) {
            if (c == '1') {
                rightOnes++;
            }
        }
        
        // Iterate through the string to calculate the score for each split
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                leftZeros++;
            } else {
                rightOnes--;
            }
            maxScore = Math.max(maxScore, leftZeros + rightOnes);
        }
        
        return maxScore;
    }
}

----------------------------------------------------------------------------- POTD JAN 2 ---------------------------------------------------------------------------------

https://leetcode.com/problems/count-vowel-strings-in-ranges/?envType=daily-question&envId=2025-01-02

You are given a 0-indexed array of strings words and a 2D array of integers queries.

Each query queries[i] = [li, ri] asks us to find the number of strings present in the range li to ri (both inclusive) of words that start and end with a vowel.

Return an array ans of size queries.length, where ans[i] is the answer to the ith query.

Note that the vowel letters are 'a', 'e', 'i', 'o', and 'u'.

 

Example 1:

Input: words = ["aba","bcb","ece","aa","e"], queries = [[0,2],[1,4],[1,1]]
Output: [2,3,0]
Explanation: The strings starting and ending with a vowel are "aba", "ece", "aa" and "e".
The answer to the query [0,2] is 2 (strings "aba" and "ece").
to query [1,4] is 3 (strings "ece", "aa", "e").
to query [1,1] is 0.
We return [2,3,0].
Example 2:

Input: words = ["a","e","i"], queries = [[0,2],[0,1],[2,2]]
Output: [3,2,1]
Explanation: Every string satisfies the conditions, so we return [3,2,1].

----------------------------------------------------------------------------------- CODE ------------------------------------------------------------------------------------

class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int m = queries.length;
        
        // Define the vowels
        String vowels = "aeiou";
        
        // Step 1: Preprocess the words to find which strings start and end with a vowel
        int[] isValid = new int[n];
        for (int i = 0; i < n; i++) {
            String word = words[i];
            if (vowels.indexOf(word.charAt(0)) != -1 && vowels.indexOf(word.charAt(word.length() - 1)) != -1) {
                isValid[i] = 1; // This word is valid
            } else {
                isValid[i] = 0; // This word is not valid
            }
        }
        
        // Step 2: Create the prefix sum array
        int[] prefix = new int[n + 1]; // prefix[i] will store the count of valid words from 0 to i-1
        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + isValid[i - 1];
        }
        
        // Step 3: Answer the queries
        int[] ans = new int[m];
        for (int i = 0; i < m; i++) {
            int li = queries[i][0];
            int ri = queries[i][1];
            ans[i] = prefix[ri + 1] - prefix[li];
        }
        
        return ans;
    }
}




*/
