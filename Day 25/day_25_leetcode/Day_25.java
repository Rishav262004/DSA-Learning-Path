/*
https://leetcode.com/problems/largest-triangle-area/description/

Given an array of points on the X-Y plane points where points[i] = [xi, yi], 
return the area of the largest triangle that can be formed by any three different points. 
Answers within 10-5 of the actual answer will be accepted.

----------------------------------------- CODE -------------------------------------------------------------

class Solution {
    public double largestTriangleArea(int[][] points) {
        double maxArea = 0;

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int k = j + 1; k < points.length; k++) {
            
                    int[] p1 = points[i];
                    int[] p2 = points[j];
                    int[] p3 = points[k];

                    double area = Math.abs(
                        p1[0] * (p2[1] - p3[1]) +
                        p2[0] * (p3[1] - p1[1]) +
                        p3[0] * (p1[1] - p2[1])
                    ) / 2.0;
                    
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        return maxArea;
    }
}

 */