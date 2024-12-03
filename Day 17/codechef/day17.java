/*

https://www.codechef.com/practice/course/number-theory/INTNT01/problems/RETURNCHANGE

Return the Change

import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int X = sc.nextInt();
            int roundedCost;
            
            if (X % 10 < 5) {
                roundedCost = (X / 10) * 10;
            } else {
                roundedCost = ((X / 10) + 1) * 10;
            }

            System.out.println(100 - roundedCost);
        }

    }
}

*/