/*

https://unstop.com/code/practice/302943

You are given an array of length N. This array is sorted and contains several duplicates that must be removed.

You are supposed to clean the duplicates from the array and then print a special sum.

The special sum is defined as follows:

Let's say there are 3 unique values in arrays 1,2,3.

The special sum would be: 2^1+2^2+2^3 = 2+4+8 = 14

Input Format
The first line of the input contains the size of the integer array, N.

The second line of the input contains N space-separated integers denoting the elements of the array nums.

Output Format
Return the special sum obtained.

Constraints
1 <= N <= 10^4

0<= nums[i] <= 21

nums are sorted in non-decreasing order.

Sample Testcase 0
Testcase Input
4
1 1 2 2
Testcase Output
6
Explanation
The unique elements in the array are: 1 and 2.


The special sum would be: 2^1+2^2 = 2+4 = 6.

Sample Testcase 1
Testcase Input
3
2 2 3
Testcase Output
12
Explanation
The unique elements in the array are: 2 and 3.


The special sum is: 2^2 + 2^3 = 4+8 = 12



-------------------------------------------- CODE --------------------------------------------------

import java.util.*;

public class Main {
    public static int removeDuplicates(List<Integer> nums, int n) {
        
        int index = 0;
        for (int i = 1; i < n; i++) {
            if (!nums.get(i).equals(nums.get(index))) {
                index++;
                nums.set(index, nums.get(i));
            }
        }
        return index + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            nums.add(sc.nextInt());
        }
        int k = removeDuplicates(nums, n);
        int sum = 0;

        for (int i = 0; i < k; ++i) {
            sum += Math.pow(2, nums.get(i));
        }
        System.out.println(sum);
    }
}


*/