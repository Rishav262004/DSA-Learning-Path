/*

A number is said to be a 248 number if the count of 2's is equal to the count of 4's
and the count of 4;s is equal to the count of 8's. The count of 2's should be at least 1.

Given a number N. Find 248 numbers in the interval [1, N]. Print the answer mod 1000000007.

code :-

import java.util.*;

class Main {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(count248Numbers(N));
    }

    static int count248Numbers(int N) {
        int count = 0;

        for (int i = 1; i <= N; i++) {
            int c2 = 0, c4 = 0, c8 = 0;
            int num = i;

            while (num > 0) {
                int digit = num % 10;
                if (digit == 2) c2++;
                else if (digit == 4) c4++;
                else if (digit == 8) c8++;
                num /= 10;
            }
            if (c2 == c4 && c4 == c8 && c2 >= 1) {
                count = (count + 1) % MOD; 
            }
        }

        return count;
    }
}












 */