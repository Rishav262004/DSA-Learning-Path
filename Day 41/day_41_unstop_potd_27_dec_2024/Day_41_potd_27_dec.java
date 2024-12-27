/*

https://unstop.com/code/practice/480984

On a distant volcanic island, researchers are studying a mysterious mineral that grows in size under sunlight.

Each day, the mineral absorbs solar energy and doubles in volume. However, due to intense geothermal activity,
every third day the mineral undergoes a cooling phase, causing it to shrink to half its size.
researchers are eager to understand how large these minerals will become over time, starting from a small initial piece.

Your task is to help them track the mineral's size after a specified number of days,
ccounting for both the daily growth and the periodic cooling.

Input Format
The first line contains an integer N, the number of minerals.

The second line contains N space-separated integers representing the initial size of the minerals.

The third line contains an integer D, the number of days.

Output Format
Output N space-separated integers representing the size of the minerals after D days.

Constraints
1 <= N <= 10^4

0 <= size[i] (initial) <= 10^4

0 <= D <= 10^4

Sample Testcase 0
Testcase Input
2
3 5
7
Testcase Output
24 40
Explanation
For the first mineral with initial height 3:
Day 1: 3 * 2 = 6
Day 2: 6 * 2 = 12
Day 3: 12 / 2 = 6
Day 4: 6 * 2 = 12
Day 5: 12 * 2 = 24
Day 6: 24 / 2 = 12
Day 7: 12 * 2 = 24


Similarly calculated for the second mineral.

Sample Testcase 1
Testcase Input
3
0 0 0
2
Testcase Output
0 0 0
Explanation
Since the initial height is 0 of all the plants, the plants can't grow. So, the output is 0 0 0.

---------------------------------------------------- CODE --------------------------------------------------------------

import java.util.*;

public class Main {
    public static long[] computeFinalSizes(int numMinerals, int[] initialSizes, int numDays) {
        long[] finalSizes = new long[numMinerals];

        for (int i = 0; i < numMinerals; ++i) {
            long size = initialSizes[i];
            for (int day = 1; day <= numDays; ++day) {
                if (day % 3 == 0) {
                    size /= 2; // Cooling phase
                } else {
                    size *= 2; // Growth phase
                }
            }
            finalSizes[i] = size;
        }

        return finalSizes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numMinerals = scanner.nextInt();
        int[] initialSizes = new int[numMinerals];
        for (int i = 0; i < numMinerals; ++i) {
            initialSizes[i] = scanner.nextInt();
        }
        int numDays = scanner.nextInt();

        long[] result = computeFinalSizes(numMinerals, initialSizes, numDays);

        for (long size : result) {
            System.out.print(size + " ");
        }
        System.out.println();
    }
}


*/