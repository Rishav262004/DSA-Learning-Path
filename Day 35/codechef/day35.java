/*

https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/AVGPROBLEM

Greater Average

------------------------------------- CODE --------------------------------------------------

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            
            double average = (A + B) / 2.0;
            
            if (average > C) {
                result.append("YES\n");
            } else {
                result.append("NO\n");
            }
        }
        
        System.out.print(result);
    }
}


*/