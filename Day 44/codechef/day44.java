/*

https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/MINPIZZA

Minimum Pizzas

---------------------------------------------------------- CODE --------------------------------------------------------

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // Reading input
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            
            int totalSlices = N * X;
            
            int pizzas = (totalSlices + 3) / 4;
            
            System.out.println(pizzas);
        }

    }
}


*/