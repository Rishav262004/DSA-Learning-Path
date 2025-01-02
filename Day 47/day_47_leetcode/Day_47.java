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


*/