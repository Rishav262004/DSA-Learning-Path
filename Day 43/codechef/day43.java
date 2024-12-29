/*

https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/SALESEASON

Sale Season

-------------------------------------------------------- CODE ---------------------------------------------------------

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();
        
        while (T-- > 0) {
            int X = scanner.nextInt();
            int finalAmount;
            
            if (X <= 100) {
                finalAmount = X;
            } else if (X <= 1000) {
                finalAmount = X - 25;
            } else if (X <= 5000) {
                finalAmount = X - 100;
            } else {
                finalAmount = X - 500;
            }
            
            System.out.println(finalAmount);
        }

    }
}


*/