/* 

https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/CHEFGAMES

Chefland Games

------------------------------------------------------- CODE -----------------------------------------------------------

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        // Read the number of test cases
        int T = sc.nextInt();
        
        while (T-- > 0) {
            // Read the decisions of the 4 referees
            int R1 = sc.nextInt();
            int R2 = sc.nextInt();
            int R3 = sc.nextInt();
            int R4 = sc.nextInt();

            // Check if all referees consider the ball to be IN
            if (R1 == 0 && R2 == 0 && R3 == 0 && R4 == 0) {
                System.out.println("IN");
            } else {
                System.out.println("OUT");
            }
        }

    }
}













*/