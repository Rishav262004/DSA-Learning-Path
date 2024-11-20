/* 
You are in the world of Mystical Realm and wanted to become the King of the magical world. To achieve this, you will be given a string consisting of six type of powers  '(',')','{','}','[' and ']'. Where, powers '(','{' and '[' are opening powers and powers ')','}' and ']' are closing powers respectively. To become king , you need to determine whether given string is magical or not.

An string will be magical if the following conditions satisfy :

1.  Every opening power should be close by same type of closing power.
2.  Opening power must be close in correct order.
3. Every Closing power has a corresponding opening power.


code : = 

import java.util.Scanner;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (solve(s)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static boolean solve(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty() || (c == ')' && stack.pop() != '(') || (c == '}' && stack.pop() != '{') || (c == ']' && stack.pop() != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

*/