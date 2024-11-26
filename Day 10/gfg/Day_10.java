/*

https://www.geeksforgeeks.org/problems/max-circular-subarray-sum-1587115620/1


Max Circular Subarray Sum
Difficulty: HardAccuracy: 29.37%Submissions: 121K+Points: 8
Given an array of integers arr[] in a circular fashion. Find the maximum subarray sum that we can get if we assume the array to be circular.

Examples:

Input: arr[] = [8, -8, 9, -9, 10, -11, 12]
Output: 22
Explanation: Starting from the last element of the array, i.e, 12, and moving in a circular fashion, we have max subarray as 12, 8, -8, 9, -9, 10, which gives maximum sum as 22.
Input: arr[] = [10, -3, -4, 7, 6, 5, -4, -1]
Output: 23
Explanation: Maximum sum of the circular subarray is 23. The subarray is [7, 6, 5, -4, -1, 10].
Input: arr[] = [-1, 40, -14, 7, 6, 5, -4, -1] 
Output: 52
Explanation: Circular Subarray [7, 6, 5, -4, -1, -1, 40] has the maximum sum, which is 52.


------------------------- code ----------------------------

class Solution {


    private int kadane(int[] arr, int n) {
        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];
        
        for (int i = 1; i < n; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }


    public int circularSubarraySum(int[] arr) {
        int n = arr.length;
        
        int maxKadane = kadane(arr, n);


        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }


        for (int i = 0; i < n; i++) {
            arr[i] = -arr[i];
        }

        int minKadane = kadane(arr, n);

        for (int i = 0; i < n; i++) {
            arr[i] = -arr[i];
        }


        int maxCircular = totalSum + minKadane; 

        if (maxCircular == 0) {
            return maxKadane;
        }

        return Math.max(maxKadane, maxCircular);
    }
}

 */