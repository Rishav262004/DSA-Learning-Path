/*

https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/AMR15A

Mahasena

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        // Read the number of soldiers
        int N = sc.nextInt();

        // Initialize counters for lucky (even weapons) and unlucky (odd weapons) soldiers
        int luckyCount = 0;
        int unluckyCount = 0;

        // Read weapon counts for each soldier
        for (int i = 0; i < N; i++) {
            int weapons = sc.nextInt();

            // Check if the weapon count is even or odd
            if (weapons % 2 == 0) {
                luckyCount++;
            } else {
                unluckyCount++;
            }
        }

        // Check if the army is READY FOR BATTLE or NOT READY
        if (luckyCount > unluckyCount) {
            System.out.println("READY FOR BATTLE");
        } else {
            System.out.println("NOT READY");
        }

    }
}

*/