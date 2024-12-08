/*

https://www.codechef.com/practice/course/number-theory/INTNT01/problems/PRIMEDICE

Hackerman

---------------------------------------------- CODE -----------------------------------------------------


import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); 

        for(int t = 0; t < T; t++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            int sum = A + B;

            if (sum <= 1) {
                System.out.println("Invalid");
                continue;
            }

            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(sum); i++) {
                if (sum % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("Alice");
            } else {
                System.out.println("Bob");
            }
        }
    }
}


 */