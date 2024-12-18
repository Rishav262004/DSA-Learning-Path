/*

https://unstop.com/code/practice/301096

Given a word S, calculate the number of distinct permutations of its letters such that the 
letter with the highest frequency does not occur consecutively. 
The input string consists solely of lowercase letters. Your task is to output the total number 
of distinct permutations where the most frequent letter is not adjacent to itself.

Input Format
The first line contains an integer T, the number of test cases.
Each of the next T lines contains a single word S.

Output Format
For each test case, print the number of distinct permutations of the letters in the given word 
where the letter with the highest frequency does not appear together.

Constraints
1 <= T <= 10^3
1 <= S.lenght <= 50

 
Sample Testcase 0
Testcase Input
1
mississippi
Testcase Output
33810
Explanation
For the word "mississippi," the letters 's' and 'i' both have the highest frequency of 4. 
We calculate the total permutations and subtract the permutations where all 'i's (or all 's's) are together:


Total permutations: 11! / (4!4!2!) = 34650
Permutations with 4 'i's together: 8! / (4!2!) = 840
Permutations with 4 'i's not together: 34650 - 840 = 33810

Sample Testcase 1
Testcase Input
1
honolulu
Testcase Output
3780
Explanation
For the word "honolulu," the letter 'o' has the highest frequency of 2. 
We calculate the total permutations and subtract the permutations where all 'o's are together:


Total permutations: 7! / (3!2!2!) = 2520
Permutations with 3 'o's together: 5! / (3!2!) = 30
Permutations with 3 'o's not together: 2520 - 30 = 3780



import java.util.*;

public class Main {
    static long[] fact = new long[51];
    static {
        fact[0] = 1;
        for (int i = 1; i <= 50; i++) {
            fact[i] = fact[i - 1] * i;
        }
    }

    static long factorial(int n) {
        return fact[n];
    }

    static long calculateValidPermutations(String s) {
        // Frequency map of characters
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        int n = s.length();
        // Calculate total permutations of all characters
        long totalPermutations = factorial(n);
        for (int count : freq.values()) {
            totalPermutations /= factorial(count);
        }

        // Find a character with the maximum frequency
        int maxFreq = Collections.max(freq.values());
        char chosenChar = '\0';
        for (Map.Entry<Character, Integer> e : freq.entrySet()) {
            if (e.getValue() == maxFreq) {
                chosenChar = e.getKey();
                break;
            }
        }

        // Calculate permutations where all chosenChar occurrences are together
        int originalCount = freq.get(chosenChar);

        // Treat all occurrences of chosenChar as one block
        // This reduces the number of items from n to (n - originalCount + 1)
        freq.put(chosenChar, 1);  // the block counts as a single "item"

        int reducedLength = n - originalCount + 1;
        long blockPermutations = factorial(reducedLength);
        for (int count : freq.values()) {
            blockPermutations /= factorial(count);
        }

        // Restore the original frequency
        freq.put(chosenChar, originalCount);

        // Valid permutations = total - block permutations
        return totalPermutations - blockPermutations;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume newline

        while (t-- > 0) {
            String s = sc.nextLine();
            long result = calculateValidPermutations(s);
            System.out.println(result);
        }

    }
}


*/