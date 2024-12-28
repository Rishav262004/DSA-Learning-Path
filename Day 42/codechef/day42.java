/*

https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/WATERFILLING

Water Filling

-------------------------------------------- CODE ----------------------------------------------------------------------

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int t = 0; t < T; t++) {
            int B1 = sc.nextInt();
            int B2 = sc.nextInt();
            int B3 = sc.nextInt();
            
            int emptyCount = 0;
            if (B1 == 0) emptyCount++;
            if (B2 == 0) emptyCount++;
            if (B3 == 0) emptyCount++;
            
            if (emptyCount >= 2) {
                System.out.println("Water filling time");
            } else {
                System.out.println("Not now");
            }
        }
    }
}

*/