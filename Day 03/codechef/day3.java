/*
https://www.codechef.com/practice/course/arrays/ARRAYS/problems/RATINGINPRAC

1. Difficulty Rating Order

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] d = new int[n];
            
            for (int i = 0; i < n; i++) {
                d[i] = scanner.nextInt();
            }
            
            int count = 0;


            for (int i = 0; i < n - 1; i++) {
                if (d[i] > d[i + 1]) {
                    count++;
                }
            }
            
            if (count == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

 */
