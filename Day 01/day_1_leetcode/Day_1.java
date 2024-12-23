// package leetcode_streak.java;
/*

https://leetcode.com/problems/two-sum/description/

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

/*
class Solution {
    public int[] twoSum(int[] nums, int target) {
        boolean found = false;


        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
    
            for (int j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                
                
                if (sum == target) {
                    return new int[] {i, j};
                }
            }
        }
        
        System.out.println("No two sum solution");
        return new int[] {};
    }
}

}

*/