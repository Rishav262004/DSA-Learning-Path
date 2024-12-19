/*

https://unstop.com/code/practice/302911

Given an array of integers arr[] of size N, find the two smallest integers in the array and form the
largest possible number using them. Output this largest number

Input Format
The first line contains an integer, where N denotes the number of elements in the array in the array.
The second line contains N space-separated integers.

Output Format
Print the largest number that can be formed.

Constraints
1 ≤ N ≤ 10^2
0 ≤ arr[i] ≤9

Sample Testcase 0
Testcase Input
7
1 2 3 4 5 6 7
Testcase Output
21
Explanation
The two minimum numbers out of the given array are 1 and 2.
f we try to make the largest number possible using these two numbers, we get 21.
Sample Testcase 1
Testcase Input
4
7 8 9 6
Testcase Output
76
Explanation
The two minimum numbers out of the given array are 6 and 7. If we try to make the
largest number possible using these two numbers, we get 76.

------------------------------------------ CODE ----------------------------------------------------

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        
        int result = formLargestNumber(n, arr);
        
    
        System.out.println(result);
    }
    
    
    public static int formLargestNumber(int n, int[] arr) {
    
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        
        
        for (int num : arr) {
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }
        
        
        String num1 = "" + min1 + min2;
        String num2 = "" + min2 + min1;
        
        return Math.max(Integer.parseInt(num1), Integer.parseInt(num2));
    }
}


 */