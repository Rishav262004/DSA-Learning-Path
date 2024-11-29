/*

https://unstop.com/code/practice/250495


In a garden with numerous apple trees labeled from 0 to N - 1, arranged in a row from left to right, the garden owner needs to collect all the apples to sell in the market. He has a basket with a capacity 'C' to collect the apples.

The process for collecting the apples is as follows:

1. Begin at the starting point, which is at x = -1.
2. Collect apples from each tree in sequential order, moving from left to right.
3. If the basket becomes full before reaching the next tree, return to the starting point (x = -1), deposit the apples collected so far, and then resume from this starting position to continue collecting apples.

The task is to determine the number of steps the garden owner will take to collect the final apple.

Input Format
The first line contains two integers separated by a space, N, represents the number of trees and, C, represents the capacity of the basket.

The second line contains N integers separated by spaces, each representing the number of apples on the corresponding tree.


Output Format
Print a single integer representing the number of steps required to collect all the apples.

Constraints
0 <= N <= 10^5

0 <= C <= 10^6

0 <= arr[i]<= 100

max(arr[i]) <= C

Sample Testcase 0
Testcase Input
2 5
2 3
Testcase Output
2
Explanation
He has enough capacity to take all the apple from both the tree in 2 steps.
Sample Testcase 1
Testcase Input
4 5
2 2 3 3
Testcase Output
14


------------------------------------------- code --------------------------------------------------------------
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of trees and basket capacity
        int N = sc.nextInt();
        int C = sc.nextInt();

        int[] apples = new int[N];
        for (int i = 0; i < N; i++) {
            apples[i] = sc.nextInt();
        }

        long steps = 0;  
        int currentLoad = 0;  

        for (int i = 0; i < N; i++) {
            if (currentLoad + apples[i] > C) {
                steps += 2 * i;  
                currentLoad = 0; 
            }

            currentLoad += apples[i]; 

        
        steps += N;  
        System.out.println(steps);
    }
}
}











*/