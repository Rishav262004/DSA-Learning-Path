/*

https://leetcode.com/problems/add-binary/description/


Given two binary strings a and b, return their sum as a binary string.

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"


----------------------------------------------- code ------------------------------------------------

class Solution {
    public String addBinary(String s1, String s2) {
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        StringBuilder result = new StringBuilder();
        int carry = 0;
        
        while (i >= 0 || j >= 0 || carry != 0) {
            int bit1 = (i >= 0) ? s1.charAt(i) - '0' : 0;
            int bit2 = (j >= 0) ? s2.charAt(j) - '0' : 0;
            int sum = bit1 + bit2 + carry;
            carry = sum / 2;
            result.append(sum % 2);
            i--;
            j--;
        }
        String res = result.reverse().toString();
        int idx = 0;
        while (idx < res.length() - 1 && res.charAt(idx) == '0') {
            idx++;
        }
        return res.substring(idx);
    }
}


------------------------------------- Problem 2-----------------------------------------------------

https://leetcode.com/problems/peak-index-in-a-mountain-array/



You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
Return the index of the peak element.

class Solution {
    public int peakIndexInMountainArray(int[] arr) {

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
