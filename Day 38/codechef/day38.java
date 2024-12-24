/*

https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/EXAMCHEF

Exams

----------------------------------------------- CODE -------------------------------------------------------------------

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
      
        Scanner sc = new Scanner(System.in);

       
        int T = sc.nextInt();

        
        while (T-- > 0) {
            
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();

            int totalStudents = X * Y;

            if (Z > totalStudents / 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}

*/