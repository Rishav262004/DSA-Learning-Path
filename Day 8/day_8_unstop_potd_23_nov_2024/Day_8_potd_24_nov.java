/*

https://unstop.com/code/practice/261000


Problem Statement
Small-Big Pattern is  a sequence where each element is either larger or smaller than its adjacent elements.

Your task is to determine the longest possible small-big pattern that can be created using the given array. 

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(longestSmallBigPattern(arr, n));
    }

    public static int longestSmallBigPattern(int[] arr, int n) {
        if (n == 0) return 0;

        int[] up = new int[n];
        int[] down = new int[n];

        up[0] = down[0] = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                up[i] = down[i - 1] + 1;
                down[i] = down[i - 1];
            } else if (arr[i] < arr[i - 1]) {

                down[i] = up[i - 1] + 1;
                up[i] = up[i - 1];
            } else {

                up[i] = up[i - 1];
                down[i] = down[i - 1];
            }
        }
        return Math.max(up[n - 1], down[n - 1]);
    }
}



*/