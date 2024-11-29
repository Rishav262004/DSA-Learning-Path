// package GFG.java;

// https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&sortBy=submissions

/*
Given an unsorted array arr containing only non-negative integers, your task is to find a continuous subarray
(a contiguous sequence of elements) whose sum equals a specified value target.
You need to return the 1-based indices of the leftmost and rightmost elements of this subarray.

Examples:

Input: arr[] = [1,2,3,7,5], target = 12
Output: [2, 4]
Explanation: The sum of elements from 2nd to 4th position is 12.

*/

import java.util.*;

public class Day_1 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int target= sc.nextInt();

        boolean found = false;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j =i;j<arr.length;j++){
                sum+=arr[j];
                if(sum == target){
                    System.out.println((i+1) + " " + (j+1));
                    found= true;
                    break;

            }

            }
            if (found) break;
        }
        if (!found) {
            System.out.println("No subarray found");
        }

    }
}
