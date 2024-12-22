/*

https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/SUBSCRIBE_

Subscriptions

-------------------------------------------- CODE ----------------------------------------------------------------------

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {

            int N = sc.nextInt();
            int X = sc.nextInt();
            
            
            int subscriptionsNeeded = (N + 5) / 6;
            
            int totalCost = subscriptionsNeeded * X;
            
            System.out.println(totalCost);
        }
        
    }
}

*/