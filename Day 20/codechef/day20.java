/*

https://www.codechef.com/practice/course/number-theory/INTNT01/problems/FOODPLAN?tab=statement

Online or Offline

------------------------------------------ CODE ---------------------------------------------------

import java.util.Scanner;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt(); 
            int M = sc.nextInt(); 
            
            double discountedOnlineCost = N - (N * 0.1);
            
            if (discountedOnlineCost < M) {
                System.out.println("ONLINE");
            } else if (discountedOnlineCost > M) {
                System.out.println("DINING");
            } else {
                System.out.println("EITHER");
            }
        }

    }
}

*/