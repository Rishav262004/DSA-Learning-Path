/*

https://www.geeksforgeeks.org/problems/find-all-triplets-with-zero-sum/1

Find All Triplets with Zero Sum

Given an array arr[], find all possible triplets i, j, k in the arr[] whose sum of elements is equals to zero. 
Returned triplet should also be internally sorted i.e. i<j<k.

Examples:

Input: arr[] = [0, -1, 2, -3, 1]
Output: [[0, 1, 4], [2, 3, 4]]
Explanation: Triplets with sum 0 are:
arr[0] + arr[1] + arr[4] = 0 + (-1) + 1 = 0
arr[2] + arr[3] + arr[4] = 2 + (-3) + 1 = 0
Input: arr[] = [1, -2, 1, 0, 5]
Output: [[0, 1, 2]]
Explanation: Only triplet which satisfies the condition is arr[0] + arr[1] + arr[2] = 1 + (-2) + 1 = 0
Input: arr[] = [2, 3, 1, 0, 5]
Output: [[]]
Explanation: There is no triplet with sum 0.

------------------------------------------ CODE ------------------------------------------------------------------------

import java.util.*;

class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        // Your code here
List<List<Integer>> triplet = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(i);
                        list.add(j);
                        list.add(k);
                        
                        triplet.add(list);
                    }
                }
            }
        }
        return triplet;
    }
}


*/