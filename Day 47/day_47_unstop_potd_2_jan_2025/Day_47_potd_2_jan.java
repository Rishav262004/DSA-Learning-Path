/*

https://unstop.com/code/practice/495580

In a quiet village, a boy named Arjun found an old diary hidden in his grandmother's trunk. The diary was filled with random letters and numbers, and a note inside read:

"Hidden within this diary are Fibonacci numbers—unlock their secrets to discover something extraordinary."

Arjun had heard of Fibonacci numbers before. They were a special sequence where each number was the sum of the two before it, starting from 0 and  1. Excited by the challenge, he decided to find these numbers.

His task was clear:

Search the diary and count how many Fibonacci numbers were hidden within.
Write down all the Fibonacci numbers he found.
Finally, list the first K Fibonacci numbers starting from 0, where K is the total count of numbers he found in the diary.
If there were no Fibonacci numbers, Arjun would close the diary and look elsewhere for his adventure.

With a curious mind and a pencil in hand, Arjun began his search. Would he uncover the Fibonacci sequence hidden in the diary, or was it just an old book with random scribbles?

Input Format
The first line of input contains a string 'S' consisting of lowercase English letters and digits(1-9).

Output Format
If Fibonacci numbers are present in the string:

Print the count of Fibonacci numbers.
Print the identified Fibonacci numbers found in the string.
Print the first k Fibonacci numbers starting from 0 where K is the count of Fibonacci numbers found in the string.
If no Fibonacci numbers are found, print 0.

Constraints
1 <= length(S) <= 10^2

Sample Testcase 0
Testcase Input
a1b13c2d8e21
Testcase Output
5
1 13 2 8 21
0 1 1 2 3
Explanation
Extracted Numbers from string: [1, 13, 2, 8, 21]
Fibonacci Series: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, . . . 


Identified Fibonacci Numbers: [1, 13, 2, 8, 21]
Count Fibonacci Numbers: 5
First 8 Fibonacci numbers: 0, 1, 1, 2, 3.

Sample Testcase 1
Testcase Input
a1b34cd2f7ghi1ch2v34
Testcase Output
6
1 34 2 1 2 34
0 1 1 2 3 5
Explanation
Extracted Numbers from string: [1, 34, 2, 7, 1, 2, 34]
Fibonacci Series: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, . . .


Identified Fibonacci Numbers: [1, 34, 2, 1, 2, 34]
Count Fibonacci Numbers: 6
First 3 Fibonacci numbers: 0, 1, 1, 2, 3, 5.


---------------------------------------------------------- CODE --------------------------------------------------------


import java.util.*;
import java.util.regex.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(optimalFibonacciCount(s));
    }

    public static String optimalFibonacciCount(String s) {
        // Extract numbers from the string
        List<Integer> numbers = extractNumbers(s);
        
        // Generate Fibonacci numbers up to the max number in the list
        int maxNum = numbers.stream().max(Integer::compareTo).orElse(0);
        Set<Integer> fibonacciSet = generateFibonacciSet(maxNum);
        
        // Identify Fibonacci numbers in the extracted list
        List<Integer> fibonacciNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (fibonacciSet.contains(num)) {
                fibonacciNumbers.add(num);
            }
        }
        
        // Prepare output
        if (fibonacciNumbers.isEmpty()) {
            return "0";
        }
        
        // Count of Fibonacci numbers
        int count = fibonacciNumbers.size();
        
        // First K Fibonacci numbers
        List<Integer> firstKFibonacci = generateFirstKFibonacci(count);
        
        // Build the output string
        StringBuilder result = new StringBuilder();
        result.append(count).append("\n");
        for (int num : fibonacciNumbers) {
            result.append(num).append(" ");
        }
        result.append("\n");
        for (int num : firstKFibonacci) {
            result.append(num).append(" ");
        }
        
        return result.toString().trim();
    }

    private static List<Integer> extractNumbers(String s) {
        List<Integer> numbers = new ArrayList<>();
        Matcher matcher = Pattern.compile("\\d+").matcher(s);
        while (matcher.find()) {
            numbers.add(Integer.parseInt(matcher.group()));
        }
        return numbers;
    }

    private static Set<Integer> generateFibonacciSet(int maxNum) {
        Set<Integer> fibonacciSet = new HashSet<>();
        int a = 0, b = 1;
        fibonacciSet.add(a);
        fibonacciSet.add(b);
        while (b <= maxNum) {
            int next = a + b;
            fibonacciSet.add(next);
            a = b;
            b = next;
        }
        return fibonacciSet;
    }

    private static List<Integer> generateFirstKFibonacci(int k) {
        List<Integer> fibonacciList = new ArrayList<>();
        int a = 0, b = 1;
        if (k > 0) fibonacciList.add(a);
        if (k > 1) fibonacciList.add(b);
        for (int i = 2; i < k; i++) {
            int next = a + b;
            fibonacciList.add(next);
            a = b;
            b = next;
        }
        return fibonacciList;
    }
}



*/