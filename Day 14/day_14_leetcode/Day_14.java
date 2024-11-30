/*

------------------------------------------------ Problem 1 -------------------------------------------------------------

https://leetcode.com/problems/length-of-last-word/description/

Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal
substring
consisting of non-space characters only.



Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.

---------------------------------------------- Code ------------------------------------------------

class Solution {
    public int lengthOfLastWord(String s) {
        int l = s.length();
        int count = 0;

        for (int i = l - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && count == 0) {
                continue;
            }
            if (s.charAt(i) == ' ') {
                break;
            }
            count++;
        }
        return count;
    }
}

-------------------------------------------- Problem 2 -----------------------------------------------------------------

https://leetcode.com/problems/find-peak-element/description/

A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums, find a peak element, and return its index.
If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be
strictly greater than a neighbor that is outside the array.

You must write an algorithm that runs in O(log n) time.



------------------------------------ Code ----------------------------------------------------------

class Solution {
    public int findPeakElement(int[] arr) {

        int start=0;
        int end = arr.length -1;

        while(start< end){
            int mid = start + (end-start)/2;

            if(arr[mid] >arr[mid+1]){
                // you are in the decreasing part of the array;
                //  this may be the ans but look at left;
                // this is why end != mid-1;
                end = mid;
            }else{
                //  you are in the increasing part of the array;
                //  because we know that mid+1 element is greater than mid

                start=mid+1;
            }
        }
        // return start; or return end;
        return start;
    }
}


*/