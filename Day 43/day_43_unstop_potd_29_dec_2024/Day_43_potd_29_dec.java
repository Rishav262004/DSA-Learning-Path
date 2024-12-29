/*

https://unstop.com/code/practice/260638

There is a passcode for a computer. The user wants to set a hint for the passcode. The passcode is a string. 
The user finds out the parts of the string that is not empty and is made up of a single alphabet.
He sets the hint as this part of the passcode string which is longest among all other parts that satisifies the same condition.
Print the length of the hint given the passcode string.

Input Format
A single line containing the passcode string.

Output Format
Print a single integer, which is the length of the longest part of the passcode that contains only one unique character.

Constraints
1 <= str.length() <= 105

Sample Testcase 0
Testcase Input
abbcccddddeeeeedcba
Testcase Output
5
Explanation
The substring "eeeee" is the longest substring with the length 5 having the character 'e' only.

Sample Testcase 1
Testcase Input
aab
Testcase Output
2
Explanation
The substring “aa” is of length 2 with the character 'a' only.

-------------------------------------------------- CODE ----------------------------------------------------------------

import java.util.Scanner;

public class Main {
    public static int longestConsecutiveCharacter(String s) {
        int maxLength = 0; // To store the maximum length
        int currentLength = 1; // To store the length of the current streak

        // Iterate through the string
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                // If the current character is the same as the previous one, increase the streak
                currentLength++;
            } else {
                // Update the maximum length and reset the current streak
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }

        // Update the maximum length for the last streak
        maxLength = Math.max(maxLength, currentLength);

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine(); // Reading the single line passcode string

        // Call user logic function and print the output
        int result = longestConsecutiveCharacter(s);
        System.out.println(result);
    }
}

*/