/*
https://www.geeksforgeeks.org/problems/aggressive-cows/1

Aggressive Cows

You are given an array with unique elements of stalls[], which denote the position of a stall.
You are also given an integer k which denotes the number of aggressive cows.
Your task is to assign stalls to k cows such that the minimum distance between any two of them is the maximum possible.

Examples :

Input: stalls[] = [1, 2, 4, 8, 9], k = 3
Output: 3
Explanation: The first cow can be placed at stalls[0],
the second cow can be placed at stalls[2] and
the third cow can be placed at stalls[3].
The minimum distance between cows, in this case, is 3, which also is the largest among all possible ways.
Input: stalls[] = [10, 1, 2, 7, 5], k = 3
Output: 4
Explanation: The first cow can be placed at stalls[0],
the second cow can be placed at stalls[1] and
the third cow can be placed at stalls[4].
The minimum distance between cows, in this case, is 4, which also is the largest among all possible ways.
Input: stalls[] = [2, 12, 11, 3, 26, 7], k = 5
Output: 1
Explanation: Each cow can be placed in any of the stalls, as the no. of stalls are exactly equal to the number of cows.
The minimum distance between cows, in this case, is 1, which also is the largest among all possible ways.


---------------------------------- CODE----------------------------------

class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        // Step 1: Sort the stalls array
        Arrays.sort(stalls);
        
        // Step 2: Binary search on the possible minimum distance
        int low = 1; // Minimum possible distance
        int high = stalls[stalls.length - 1] - stalls[0]; // Maximum possible distance
        int result = 0;
        
        while (low <= high) {
            int mid = low + (high - low) / 2; // Middle distance
            
            // Check if placing cows with at least 'mid' distance is possible
            if (canPlaceCows(stalls, k, mid)) {
                result = mid; // Update result as mid is a valid distance
                low = mid + 1; // Try for a larger minimum distance
            } else {
                high = mid - 1; // Try for a smaller minimum distance
            }
        }
        
        return result;
    }
    
    // Helper function to check if we can place 'k' cows with at least 'distance' apart
    private static boolean canPlaceCows(int[] stalls, int k, int distance) {
        int count = 1; // Place the first cow in the first stall
        int lastPlaced = stalls[0];
        
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPlaced >= distance) {
                count++; // Place a cow here
                lastPlaced = stalls[i]; // Update the position of the last placed cow
                
                if (count == k) { // All cows are placed successfully
                    return true;
                }
            }
        }
        
        return false; // Not possible to place all cows with the given distance
    }
}


 */