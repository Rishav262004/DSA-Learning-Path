/*

https://www.codechef.com/practice/course/number-theory/INTNT01/problems/DIVIDEMAKEEQ

Luigi and Uniformity

import java.util.*;
import java.io.*;

---------------------------------------------- CODE -----------------------------------------------------

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            
            int gcd = A[0];
            for (int i = 1; i < N; i++) {
                gcd = findGCD(gcd, A[i]);
            }
            
            int moves = 0;
            for (int i = 0; i < N; i++) {
                if (A[i] > gcd) {
                    moves++;
                }
            }
            
            System.out.println(moves);
        }

    }
    
    
    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

 */