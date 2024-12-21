/*

https://unstop.com/code/practice/485001

In a mystical realm, a powerful wizard aims to boost the strength of his spells. He seeks guidance from a wise sorcerer, who reveals a special technique: each time the wizard casts an enchantment, he should transform it to its "next strongest form", i.e, next lexicographically greater. This involves slightly modifying the spell each time to make it more potent.

To help the wizard master this technique, the sorcerer sets up a challenge:

Task: The sorcerer provides the wizard with a base spell (a word or incantation) and a specific number.
Challenge: The wizard must practice by transforming the spell through a series of magical upgrades, each one being the next stronger version of the previous spell.
Goal: After the specified number of transformations, the wizard's spell will have reached its ultimate form, ready to be unleashed with amplified power.
This practice helps the wizard understand how to control and scale the strength of his enchantments, preparing him for the most challenging magical feats!

Input Format
The first line contains two space separated integers N and T, the length of the spell and the number of transformations, respectively.

The second line contains a string S of length N, representing the initial spell which consist of lowercase alphabets.

Output Format
Output the spell after performing T transformations. If the spell is already at its most powerful form or it’s not possible to achieve the spell after T transformations, then print "FAIL".

Constraints
1 <= N <= 10^2

0 <= T <= 10^2

Sample Testcase 0
Testcase Input
5 3
abced
Testcase Output
abecd
Explanation
After 1st transformation: "abced" → "abdce"
After 2nd transformation: "abdce" → "abdec"
After 3rd transformation: "abdec" → "abecd"
The spell after 3 transformations is "abecd".

Sample Testcase 1
Testcase Input
3 6
abc
Testcase Output
FAIL
Explanation
After 1st transformation: "abc" → "acb"
After 2nd transformation: "acb" → "bac"
After 3rd transformation: "bac" → "bca"
After 4th transformation: "bca" → "cab"
After 5th transformation: "cab" → "cba"
cba is the lexicographically greatest spell, but we need to continue this tranformation process upto 6th iteration, hence it can't be possibe tranform the spell.




------------------------------------------------------- CODE -----------------------------------------------------------

import java.util.Scanner;

public class Main {
    public static String encodeMessage(String s, int t) {
        char[] spell = s.toCharArray();
        int count = 0;

        while (count < t) {
            if (!nextPermutation(spell)) {
                return "FAIL";
            }
            count++;
        }

        return new String(spell);
    }

    private static boolean nextPermutation(char[] array) {
        int n = array.length;

        // Step 1: Find the rightmost character that is smaller than its next character
        int i = n - 2;
        while (i >= 0 && array[i] >= array[i + 1]) {
            i--;
        }

        // If no such character is found, we are at the largest permutation
        if (i < 0) {
            return false;
        }

        // Step 2: Find the rightmost character to the right of 'i' that is greater than array[i]
        int j = n - 1;
        while (array[j] <= array[i]) {
            j--;
        }

        // Step 3: Swap characters at i and j
        swap(array, i, j);

        // Step 4: Reverse the sequence after index i
        reverse(array, i + 1, n - 1);

        return true; // Transformation successful
    }

    // Utility method to swap two characters in the array
    private static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Utility method to reverse part of the array
    private static void reverse(char[] array, int start, int end) {
        while (start < end) {
            swap(array, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String s = scanner.nextLine();

        String result = encodeMessage(s, t);
        System.out.println(result);
    }
}


*/