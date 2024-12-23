/*

https://leetcode.com/problems/binary-search/description/

Given an array of integers nums which is sorted in ascending order, and an integer target, 
write a function to search target in nums. If target exists, then return its index. Otherwise, return -1


class Solution {
    public int search(int[] nums, int target) {

    int start=0;
    int end = nums.length-1;

    while(start<=end){

        int mid = start + (end-start)/2 ;
        if(target>nums[mid]){
               start= mid+1;
        }
        else{
            end=mid-1;
        }

        if(target==nums[mid]){
           return mid;
        }
    }

return -1;

    }


 */