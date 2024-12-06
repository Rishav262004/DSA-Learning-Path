/*

https://unstop.com/code/practice/302976


You are provided with an array of integers of size N. Within this array, your task is to identify the smallest positive integer that is not present. Once you've found this integer, determine its ASCII value and add this value to the total sum of the array.
Finally, return the final sum.

Input Format
An array nums of size N is given as input.

Output Format
Return the sum obtained.

Constraints
1 <= N <= 5 * 10^5
-10^6 <= nums[i] <= 10^6 – 1

Sample Testcase 0
Testcase Input
3
3 1 0
Testcase Output
54
Explanation
Ascii value of 2 is 50 and sum = 50+3+1+0=54
Sample Testcase 1
Testcase Input
4
2 4 3 5
Testcase Output
63
Explanation
Ascii value of 1=49
Sum=63

----------------------------------------------------------- CODE ------------------------------------

import java.util.*;

public class Main {

    public static int smallestMissingPositive(int[] nums, int n) {
        
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = n + 1;
            }
        }

        for (int i = 0; i < n; i++) {
            int val = Math.abs(nums[i]);
            if (val <= n && nums[val - 1] > 0) {
                nums[val - 1] = -nums[val - 1];
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return n + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        long sum = 0; 
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            sum += nums[i];
        }

        int missing = smallestMissingPositive(nums, n);
        

        String missingStr = String.valueOf(missing);
        int asciiSum = 0;
        for (char c : missingStr.toCharArray()) {
            asciiSum += (int)c;
        }
        sum += asciiSum;

        System.out.println(sum);
    }
}

*/