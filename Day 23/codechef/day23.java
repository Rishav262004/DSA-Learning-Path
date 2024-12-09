/*

https://www.codechef.com/practice/course/number-theory/INTNT01/problems/EXISTENCE

Existence

import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            long X = sc.nextLong();
            long Y = sc.nextLong();

            
            long X2 = X * X;
            long X4 = X2 * X2;
            long Y2 = Y * Y;
            long leftSide = X4 + 4 * Y2;
            long rightSide = 4 * X2 * Y;

            if (leftSide == rightSide) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}

 */