/*

https://www.codechef.com/practice/course/strings/STRINGS/problems/ADDONE

Add One

-------------------------------------------------------- CODE ----------------------------------------------------------

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        for (int t = 0; t < T; t++) {
            
            String N = sc.nextLine();

            StringBuilder result = new StringBuilder(N);

            int carry = 1;
            for (int i = result.length() - 1; i >= 0; i--) {
                int digit = result.charAt(i) - '0' + carry;
                if (digit == 10) {
                    result.setCharAt(i, '0');
                    carry = 1;
                } else {
                    result.setCharAt(i, (char) (digit + '0'));
                    carry = 0;
                    break;
                }
            }

            if (carry == 1) {
                result.insert(0, '1');
            }

            System.out.println(result.toString());
        }

    }
}


*/