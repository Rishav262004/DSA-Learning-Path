/*

https://unstop.com/code/practice/484668

In a hidden lab, Optimus Prime, a notorious and ambitious scientist, is planning to create a mutated virus that could potentially wreak havoc across the world. His twisted mind has devised a formula to build this devastating virus, but he needs to start with specific ingredients: groups of three "base viruses," each with a specific "contamination level."

To create a mutated virus, Optimus must find three viruses with contamination levels that are either identical or consecutive, like levels 5, 5, and 5, or levels 2, 3, and 4. Optimus has exactly V different viruses at his disposal, each with its own contamination level, but each virus can only be used once. To proceed with his plan, he needs to know the maximum number of mutated viruses he can create from the viruses he currently has. Can you help Optimus figure out how many powerful mutated viruses he can make?

Input Format
The first line contains one integer V,number of viruses.

The second line contains V space separated integers representing the contamination levels of the viruses.

Output Format
Output a single integer, the maximum number of mutated viruses Shubham can create, if no such virus formed, return 0.

Constraints
1 <= V <= 10^3

1 <= Contamination level <= 10^2

Sample Testcase 0
Testcase Input
10
1 2 2 3 3 3 4 4 4 4
Testcase Output
3
Explanation
Let's group the virus:
1st M Virus: [1, 2, 3]
2nd M Virus: [2, 3, 4]
3rd M Virus: [4, 4, 4]
Total Count = 3

Sample Testcase 1
Testcase Input
7
1 2 3 4 4 4 5
Testcase Output
2
Explanation
Let's group the virus:
1st M Virus: [1, 2, 3]
2nd M Virus; [4, 4, 4]
Total count: 2

------------------------------------------ CODE ----------------------------------------------------

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();   // Number of viruses
        int[] contamination = new int[V];
        for (int i = 0; i < V; i++) {
            contamination[i] = sc.nextInt();
        }
        sc.close();

        // Build frequency array freq[1..100]
        int[] freq = new int[101];
        for (int level : contamination) {
            freq[level]++;
        }

        int answer = 0;

        // Try to form groups of three
        for (int i = 1; i <= 100; i++) {
            while (freq[i] > 0) {
                // Check for a triplet of the same level
                if (freq[i] >= 3) {
                    freq[i] -= 3;
                    answer++;
                } 
                // Check for a triplet of consecutive levels
                else if (i <= 98 && freq[i] > 0 && freq[i + 1] > 0 && freq[i + 2] > 0) {
                    freq[i]--;
                    freq[i + 1]--;
                    freq[i + 2]--;
                    answer++;
                } else {
                    break; // No more groups can be formed with this level
                }
            }
        }

        System.out.println(answer);
    }
}


*/