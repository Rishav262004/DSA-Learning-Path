/*

https://www.geeksforgeeks.org/problems/add-binary-strings3805/1

Add Binary Strings

Given two binary strings s1 and s2 consisting of only 0s and 1s. Find the resultant string after adding the two Binary Strings.
Note: The input strings may contain leading zeros but the output string should not have any leading zeros.

Input: s1 = "1101", s2 = "111"
Output: 10100
Explanation:
 1101
+ 111
10100
Input: s1 = "00100", s2 = "010"
Output: 110
Explanation: 
  100
+  10
  110Given two binary strings s1 and s2 consisting of only 0s and 1s. Find the resultant string after adding the two Binary Strings.
Note: The input strings may contain leading zeros but the output string should not have any leading zeros.

Input: s1 = "1101", s2 = "111"
Output: 10100
Explanation:
 1101
+ 111
10100
Input: s1 = "00100", s2 = "010"
Output: 110
Explanation: 
  100
+  10
  110

--------------------------------------------------------------- code --------------------------------------------

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


----------------------------------------------- Problem 2 ---------------------------------------------------------

// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

// Find position of an element in a sorted array of infinite numbers

public class infinite_array_search {
    public static void main(String args[]) {
        int[] arr = { 1, 2, 5, 7, 6, 3, 8, 9 };
        int target = 5;

        int position = ans(arr, target);
        System.out.println("Position of " + target + " is: " + position);
    }

    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int temp = end + 1;  // this is my new start

            end = (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int arr[], int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}




*/
