/*

https://www.codechef.com/practice/course/strings/STRINGS/problems/WORDLE

Wordle

--------------------------------------------- CODE -------------------------------------------------

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

        while (T-- > 0) {
            String S = sc.nextLine();

            String T_word = sc.nextLine();

            StringBuilder M = new StringBuilder();

            for (int i = 0; i < 5; i++) {
                if (S.charAt(i) == T_word.charAt(i)) {
                    M.append('G');
                } else {
                    M.append('B');
                }
            }

            System.out.println(M.toString());
        }
    }
}



 */