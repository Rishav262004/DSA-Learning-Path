/*

https://www.geeksforgeeks.org/problems/non-overlapping-intervals/1


Non-overlapping Intervals

Given a 2D array intervals[][] of representing intervals where intervals [i] = [starti, endi ]. 
Return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.

Examples:

Input: intervals[][] = [[1, 2], [2, 3], [3, 4], [1, 3]]
Output: 1
Explanation: [1, 3] can be removed and the rest of the intervals are non-overlapping.
Input: intervals[][] = [[1, 3], [1, 3], [1, 3]]
Output: 2
Explanation: You need to remove two [1, 3] to make the rest of the intervals non-overlapping.
Input: intervals[][] = [[1, 2], [5, 10], [18, 35], [40, 45]]
Output: 0
Explanation: All ranges are already non overlapping.

---------------------------------------------- CODE --------------------------------------------------------------------

class Solution {
    static int minRemoval(int intervals[][]) {

        for (int i = 0; i < intervals.length - 1; i++) {
            for (int j = i + 1; j < intervals.length; j++) {
                if (intervals[i][1] > intervals[j][1]) {
                    int[] temp = intervals[i];
                    intervals[i] = intervals[j];
                    intervals[j] = temp;
                }
            }
        }
        
        int count = 0;
        int lastEnd = Integer.MIN_VALUE;

        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] < lastEnd) {
                count++;
            } else {
        
                lastEnd = intervals[i][1];
            }
        }
        return count;
    }
}


 */