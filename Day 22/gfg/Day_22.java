/*

https://www.geeksforgeeks.org/problems/overlapping-intervals--170633/1


Overlapping Intervals
Difficulty: MediumAccuracy: 57.41%Submissions: 70K+Points: 4
Given an array of Intervals arr[][], where arr[i] = [starti, endi].
The task is to merge all of the overlapping Intervals.

Examples:

Input: arr[][] = [[1,3],[2,4],[6,8],[9,10]]
Output: [[1,4], [6,8], [9,10]]
Explanation: In the given intervals we have only two overlapping intervals here, [1,3] and [2,4] which on merging will become [1,4]. 
Therefore we will return [[1,4], [6,8], [9,10]].
Input: arr[][] = [[6,8],[1,9],[2,4],[4,7]]
Output: [[1,9]]
Explanation: In the given intervals all the intervals overlap with the interval [1,9]. Therefore we will return [1,9].


------------------------------------------- CODE -----------------------------------------------------

class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        int[] currentInterval = arr[0];
        merged.add(currentInterval);

        for (int[] interval : arr) {
            int currentStart = currentInterval[0];
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if (currentEnd >= nextStart) {

                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                
                currentInterval = interval;
                merged.add(currentInterval);
            }
        }

        return merged;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        
        int[][] arr1 = {{1, 3}, {2, 4}, {6, 8}, {9, 10}};
        List<int[]> result1 = solution.mergeOverlap(arr1);
        for (int[] interval : result1) {
            System.out.println(Arrays.toString(interval));
        }

    
        int[][] arr2 = {{6, 8}, {1, 9}, {2, 4}, {4, 7}};
        List<int[]> result2 = solution.mergeOverlap(arr2);
        for (int[] interval : result2) {
            System.out.println(Arrays.toString(interval));
        }
    }
}


*/