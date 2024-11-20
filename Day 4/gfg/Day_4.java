/*
https://www.geeksforgeeks.org/problems/majority-vote/1

You are given an array of integer arr[] where each number represents a vote to a candidate.
Return the candidates that have votes greater than one-third of the total votes,
If there's not a majority vote, return an empty array.

Note: The answer should be returned in an increasing format.

Examples:

Input: arr[] = [2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6]
Output: [5, 6]
Explanation: 5 and 6 occur more n/3 times

code:

import java.util.*;

public class Main {
    public static List<Integer> findMajority(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > n / 3 && !result.contains(nums[i])) {
                result.add(nums[i]);
            }
        }

        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6};
        System.out.println(findMajority(arr));
    }
}






*/