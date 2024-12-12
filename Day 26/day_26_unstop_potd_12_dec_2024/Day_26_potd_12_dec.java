/*

https://unstop.com/code/practice/294132

Luke has a long bookshelf filled with n books numbered from 1 to n, and the ith book has the height ai.
He recently bought a new shelf to keep some of his books since the first one was almost full.
To add books to his new shelf, he walks across the first bookshelf from left to right,
i.e., starting from book 1 towards book n. For each book on the shelf, he can do one of the following operations:

Leave the book as it is and move on to the next one.
Take the book out and place it on the new shelf at the leftmost available space.
To make his new shelf look good, he wants the books on the new shelf to be in a strictly
increasing order of height from left to right. In other words, if the new shelf has m books numbered
from 1 (leftmost) to m (rightmost), then for any i > 1, the height of the ith book should be strictly
greater than the height of the i-1th Book. Help him find out the maximum number of books that he can place on his new shelf.

Print the modulo multiplicative inverse of the maximum number of books that he can place on his new shelf with 10^6+7.

Input Format
The first line of the input contains a single integer n representing the number of books.
The second line of the input contains n space-separated integers denoting the height of the books.
Output Format
Print a single integer, the modulo multiplicative inverse of the maximum number of books that
he can place on his new shelf with 10^6+7.

Constraints
1 <= n <= 10^4
Sample Testcase 0
Testcase Input
8
10  9  2  5  3  7  101  18
Testcase Output
250002
Explanation
Some of the ways to pick out the maximum number of books are [2, 5, 7, 18], [2,5, 7, 101], and
[2, 3, 7, 18]. We can see that the maximum number of books placed on the new shelf is 4.

Its modulo multiplicative inverse with 10^6+7 is 250002.

Sample Testcase 1
Testcase Input
6
9 9 9 9 9 9
Testcase Output
1
Explanation
We can pick only one of the books because we need them in a strictly increasing order of height.
So, the maximum number of books placed on the new shelf is 1.

Its modulo multiplicative inverse with 10^6+7 is 1.

------------------------------------------ CODE ------------------------------------------------------------------------

import java.util.*;

public class Main {
    static final int MOD = 1000007;

    private static int modInverse(int a, int m) {
        int m0 = m;
        int x0 = 0, x1 = 1;
        if (m == 1) return 0;

        while (a > 1) {
            int q = a / m;
            int t = m;
            m = a % m;
            a = t;
            t = x0;
            x0 = x1 - q * x0;
            x1 = t;
        }

        if (x1 < 0)
            x1 += m0;

        return x1;
    }

    private static int findLISLength(List<Integer> heights) {
        List<Integer> lis = new ArrayList<>();
        for (int height : heights) {
            int pos = Collections.binarySearch(lis, height);
            if (pos < 0) {
                pos = -(pos + 1);
            }
            if (pos < lis.size()) {
                lis.set(pos, height);
            } else {
                lis.add(height);
            }
        }
        return lis.size();
    }

    // Main function to calculate the modular inverse of LIS length
    public static int calculateInverseOfLISLength(int n, List<Integer> heights) {
        int lisLength = findLISLength(heights);
        // Use Extended Euclidean Algorithm instead of Fermat's theorem
        return modInverse(lisLength, MOD);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> heights = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            heights.add(scanner.nextInt());
        }
        int result = calculateInverseOfLISLength(n, heights);
        System.out.println(result);
    }
}

 */