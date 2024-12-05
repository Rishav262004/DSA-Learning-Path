/*

https://unstop.com/code/practice/302877

An array of N non-negative integers, Arr, is given. Let X be bitwise AND of all the integers in Arr. 
Print the minimum integer Y, such that the bitwise XOR of Y and X is 0.

Input Format
The first line contains an integer, where N denotes the number of integers in the array.

The second line contains N space-separated integers.

Output Format
The output should print the minimum integer Y, such that the bitwise xor of Y and X is 0.

Constraints
1 <= N <= 10^6.

0<=Arr[i]<=10^9

Sample Testcase 0
Testcase Input
2
1 2
Testcase Output
0
Explanation
X=1&2=0 there doesn't exist Y less than 0, such that X XOR Y=0. So, the answer will be 0.

Sample Testcase 1
Testcase Input
3
4 5 6
Testcase Output
4
Explanation
X=4&5&6=4 there doesn't exist Y less than 4, such that X XOR Y=0. So, the answer will be 4.

--------------------------------------------- Code -------------------------------------------------

import java.util.*;

public class Main {

    public static String decToBinary(int n) {
        return Integer.toBinaryString(n);
    }

    public static int binaryToDecimal(String str) {
        return Integer.parseInt(str, 2);
    }

    public static int findMinimumY(int n, int[] arr) {
        int X = arr[0];
        for (int i = 1; i < n; i++) {
            X &= arr[i];
        }
        return X;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = findMinimumY(n, arr);
        System.out.println(result);
    }
}


 */