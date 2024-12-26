/*

https://unstop.com/code/practice/477062

Once upon a time, in a mystical kingdom, there lived a wise young and smart wizard named Harshavardhan.
Harshavardhan had an enchanted box that granted magical powers to anyone who could unlock it.
To unlock this box, one had to find a combination of three magical crystals.

These crystals can have different power levels which can range from 1 to N,
and need to be arranged in a way which follows a specific rule: the power level of the first crystal
must be less than or equal to the second one, and the power level of the second crystal must be less
than or equal to the third one.

Additionally, when combined together, their product must not exceed a magical limit ( N ).

Your task is to determine the number of valid combinations of these three crystals.

Input Format
The first line of input contains a single integer N representing the magical limit.

Output Format
Display a single integer representing the number of valid combinations of these three crystals.

Constraints
1 <= N <= 10^8

Sample Testcase 0
Testcase Input
1
Testcase Output
1
Explanation
The only valid triple is (1, 1, 1).

Sample Testcase 1
Testcase Input
10
Testcase Output
16
Explanation
The valid combinations are:

(1, 1, 1), (1, 1, 2), (1, 1, 3), (1, 1, 4), (1, 1, 5), (1, 1, 6), (1, 1, 7), (1, 1, 8), (1, 1, 9), (1, 1, 10)

(1, 2, 2), (1, 2, 3), (1, 2, 4), (1, 2, 5)

(1, 3, 3)

(2, 2, 2)

----------------------------------------------------- CODE -------------------------------------------------------------

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();  // Read the magical limit
        sc.close();

        long count = 0;

        // Iterate through all possible values of a
        for (long a = 1; a * a * a <= N; a++) {
            // Iterate through all possible values of b
            for (long b = a; a * b * b <= N; b++) {
                // Calculate the maximum possible value of c
                long maxC = N / (a * b);
                count += (maxC - b + 1); // Count all valid c values
            }
        }

        // Print the total count of valid combinations
        System.out.println(count);
    }
}

*/