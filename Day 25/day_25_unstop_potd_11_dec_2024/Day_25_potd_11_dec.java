/*

https://unstop.com/code/practice/298029

You are given an integer N with a value in the range [-10^18,10^18].
Your task is to find an integer A such that 0≤A<998244353-1  and the following condition holds:

(N-A)-is divisible by -998244353.
It can be proved that such an integer is unique.

----------------------------------------------------- CODE -------------------------------------------------------------

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long MOD = 998244353;
        // Compute A = N mod 998244353, ensuring A is in [0, 998244353)
        long A = ((N % MOD) + MOD) % MOD;
        System.out.println(A);
    }
}


 */