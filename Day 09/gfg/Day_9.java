/* 
https://www.geeksforgeeks.org/problems/maximum-product-subarray3604/1


Given an array arr[] that contains positive and negative integers (may contain 0 as well). Find the maximum product that we can get in a subarray of arr.

Note: It is guaranteed that the output fits in a 32-bit integer.

Examples

Input: arr[] = [-2, 6, -3, -10, 0, 2]
Output: 180
Explanation: The subarray with maximum product is {6, -3, -10} with product = 6 * (-3) * (-10) = 180.
Input: arr[] = [-1, -3, -10, 0, 60]
Output: 60
Explanation: The subarray with maximum product is {60}.
Input: arr[] = [2, 3, 4] 
Output: 24 
Explanation: For an array with all positive elements, the result is product of all elements. 


---------------------------------- code --------------------------------------

https://www.geeksforgeeks.org/problems/maximum-product-subarray3604/1

class Solution {
    int maxProduct(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int maxProductSoFar = arr[0];
        int minProductSoFar = arr[0];
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int temp = maxProductSoFar;

            if (arr[i] < 0) {
                maxProductSoFar = minProductSoFar;
                minProductSoFar = temp;
            }
            
            maxProductSoFar = Math.max(arr[i], maxProductSoFar * arr[i]);
            minProductSoFar = Math.min(arr[i], minProductSoFar * arr[i]);

            result = Math.max(result, maxProductSoFar);
        }
        return result;
    }
}
    
*/ 