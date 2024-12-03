/*

https://leetcode.com/problems/remove-element/description/?envType=problem-list-v2&envId=array

Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. 
The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {

            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i; 
    }
}

 */