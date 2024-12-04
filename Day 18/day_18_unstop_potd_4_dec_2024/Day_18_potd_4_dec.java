/*

https://unstop.com/code/practice/302679

Alice and Bob attend an event where there are N people, each either poor 
(requiring money) or rich (donating money). Alice can only move left, 
while Bob can only move right from a starting index i, called the "Magical Index." 
They both start with 0 money, collecting from the rich and giving to the poor as they move. 
The goal is to find a starting index i such that, after their respective movements, Alice and Bob end with the same amount of money.

The input is an array of size N, where negative values represent poor people, 
and non-negative values represent rich people. If any value is zero, it represents a rich person donating 0 money. 
The task is to determine if such a starting index exists where both Alice and Bob end with equal amounts of money.

-------------------------------------------- code ----------------------------------------------

import java.util.Scanner;

public class Main {
    public static int magicalIndex(int[] a, int n) {
        int totalSum = 0;
    
        for (int num : a) {
            totalSum += num;
        }
        int leftSum = 0;
    
        for (int i = 0; i < n; i++) {
            
            int rightSum = totalSum - leftSum - a[i];
            
            if (leftSum == rightSum) {
                return i + 1; 
            }
            
            leftSum += a[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(magicalIndex(A, N));
    }
}

 */
