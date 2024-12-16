/*

https://unstop.com/code/practice/301890

Bruno has N grapes arranged in a row, each labeled with a type represented by a positive integer. He has two smart rabbits that can fetch grapes. When given a type number X, a rabbit will search through the row to pick the first grape of that type it finds, starting either from the left end or the right end. The rabbit takes one second to check each grape.

Bruno wants to eat two grapes of different types, where the sum of their types equals K. He can send both rabbits out at the same time, either from one end or from both ends of the row. Your task is to find out the minimum time it will take for the rabbits to bring back the two grapes. If it's not possible to find two grapes that meet this requirement, return -1.

Input Format
The first line of input contains two space-separated integers N and K, denoting the number of grapes and the required sum respectively. 

The second line contains N space-separated integers representing the types of the grapes.

Output Format
Print a single integer indicating the minimum number of seconds required for Bruno to get the two grapes. If it's not possible to get the desired grapes, print -1.

Constraints
2 ≤ N ≤ 5 × 10^5
1 ≤ K ≤ 10^6
1 ≤ Ti ≤ 10^6

Sample Testcase 0
Testcase Input
5 5
2 4 3 2 1
Testcase Output
2
Explanation
Bruno wants two grapes with types that sum to 5.
Possible pairs are:
Type 4 and Type 1 (since 4 + 1 = 5).

Release one rabbit from the left with type 4 and one rabbit from the right with type 1:
The first rabbit finds grape of type 4 after checking 2 grapes (2 seconds).
The second rabbit finds grape of type 1 after checking 1 grape (1 second).
The total time taken is the maximum of these two, which is 2 seconds.

Thus, the answer is 2.

Sample Testcase 1
Testcase Input
5 5
2 4 9 2 5
Testcase Output
-1
Explanation
Bruno wants two grapes with types that sum to 5.
There are no pairs of grapes whose types add up to 5 in the given row.
Therefore, the output is -1.

--------------------------------------------------------- CODE ---------------------------------------------------------

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int K = Integer.parseInt(firstLine[1]);

        String[] types = br.readLine().split(" ");
        int[] grapes = new int[N];
        for (int i = 0; i < N; i++) {
            grapes[i] = Integer.parseInt(types[i]);
        }

        // We'll store, for each type:
        //   - The earliest occurrence (to know how soon it can be fetched from the left)
        //   - The earliest occurrence from the right (to know how soon it can be fetched from the right)
        // For this, we need the minimal index and maximal index of occurrence.

        // Map: type -> minimal index from left (L), minimal index from right (R)
        // minimal_from_left[type] = index_of_first_occurrence + 1 (time from left)
        // minimal_from_right[type] = N - index_of_last_occurrence (time from right)
        // Since type can be up to 1e6, we can use arrays if we want, but it would be large.
        // We'll use a HashMap since it's sparser. We'll store in arrays if memory allows.

        // First, find unique types and store earliest and latest occurrence indices.
        // For memory and efficiency, since Ti ≤ 10^6, we can use arrays of length 10^6 + 1.
        int MAX_TYPE = 1000000;
        int[] earliest = new int[MAX_TYPE + 1]; // store earliest occurrence (1-based index)
        int[] latest = new int[MAX_TYPE + 1];   // store latest occurrence (1-based index)
        Arrays.fill(earliest, -1);
        Arrays.fill(latest, -1);

        // Fill earliest and latest occurrences
        for (int i = 0; i < N; i++) {
            int t = grapes[i];
            if (earliest[t] == -1) {
                earliest[t] = i + 1; // store 1-based indexing for convenience
            }
            latest[t] = i + 1;  // update as we go, end with last occurrence
        }

        // We only care about types that appear at least once.
        // We'll extract the unique types from earliest/latest arrays.
        List<Integer> uniqueTypes = new ArrayList<>();
        for (int t = 1; t <= MAX_TYPE; t++) {
            if (earliest[t] != -1) {
                uniqueTypes.add(t);
            }
        }

        int minTime = Integer.MAX_VALUE;
        boolean found = false;

        // To avoid double counting pairs, we can:
        // - If t < K-t, only check those pairs once. 
        // But we must also handle the case t == K/2 for even K carefully.
        // We'll just check all and ensure we do minimal computations.
        
        // Use a set to avoid checking the same pair twice if desired:
        // Actually, if t != c, checking once is enough. If t == c, we need special handling.
        
        // We'll do:
        // For each type t, let c = K - t. If c < 1 or c > MAX_TYPE, skip.
        // If earliest[c] == -1 (doesn't exist), skip.
        // If t > c, we might have checked this pair already. To avoid double computations,
        // we can enforce t <= c to reduce redundant checks. If t == c, we need at least two occurrences.
        
        // Four scenarios to consider for fetching grapes:
        // Let L(t) = earliest[t], R(t) = N - (latest[t] - 1) = N - (latest[t] - 1) = N - latest[t] + 1 is time from right
        // Actually, from right: if latest[t] is position p (1-based), time from right = N - p + 1.
        
        // The total time is the max of the times taken by each rabbit. We want the minimal possible max time.
        
        // For each pair (t, c):
        // scenarios:
        //   1. Rabbit A from left for t and Rabbit B from left for c: time = max(L(t), L(c))
        //   2. Rabbit A from left for t and Rabbit B from right for c: time = max(L(t), R(c))
        //   3. Rabbit A from right for t and Rabbit B from left for c: time = max(R(t), L(c))
        //   4. Rabbit A from right for t and Rabbit B from right for c: time = max(R(t), R(c))
        //
        // We choose the minimal of these four scenarios.
        
        // If t == c, we need two distinct grapes of the same type:
        // For that to work, we must have at least two occurrences. If not, skip.
        // In that case:
        //    The best scenario might be one from left and one from right, or both from same side if multiple occurrences.
        
        // Precompute R(t) for all t:
        // R(t) = N - latest[t] + 1 if earliest[t] != -1
        int[] fromRight = new int[MAX_TYPE + 1];
        for (int t : uniqueTypes) {
            fromRight[t] = N - latest[t] + 1;
        }
        
        // Now find pairs:
        // We'll do t <= c condition to avoid double counting.
        for (int t : uniqueTypes) {
            int c = K - t;
            if (c < 1 || c > MAX_TYPE) continue; // complement out of range
            if (earliest[c] == -1) continue; // complement type doesn't exist
            
            // If t > c, skip to avoid double count
            if (t > c) continue;
            
            int L_t = earliest[t];
            int R_t = fromRight[t];
            int L_c = earliest[c];
            int R_c = fromRight[c];

            // If t == c, we need two distinct occurrences of this type
            if (t == c) {
                // Check if there's more than one occurrence of type t
                // earliest[t] gives the first occurrence, latest[t] gives the last.
                // If earliest[t] != latest[t], that means at least two occurrences.
                if (earliest[t] == latest[t]) {
                    // Only one occurrence of this type, can't form a pair
                    continue;
                }
            }

            // Evaluate the four scenarios:
            // scenario 1: both from left
            int scenario1 = Math.max(L_t, L_c);
            // scenario 2: t from left, c from right
            int scenario2 = Math.max(L_t, R_c);
            // scenario 3: t from right, c from left
            int scenario3 = Math.max(R_t, L_c);
            // scenario 4: both from right
            int scenario4 = Math.max(R_t, R_c);

            int best = Math.min(Math.min(scenario1, scenario2), Math.min(scenario3, scenario4));
            if (best < minTime) {
                minTime = best;
                found = true;
            }
        }

        System.out.println(found ? minTime : -1);
    }
}

 */