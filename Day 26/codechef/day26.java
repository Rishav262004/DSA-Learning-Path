/*

https://www.codechef.com/learn/course/java-beginner-v2-p2/BJ00BP17A_V2/problems/LBJ208A

Problem (Shoes)

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases
        
        while (T-- > 0) {
            int N = sc.nextInt(); 
            int M = sc.nextInt();
         
            int extraShoes = Math.max(0, N - M) + N;
            System.out.println(extraShoes);
        }
        sc.close();
    }
}

*/