/*

https://unstop.com/code/practice/277797

You are given a Perfect Binary Tree of height N. A perfect binary tree is a binary tree in which every internal node has exactly two child nodes, and all the leaf nodes are at the same level.
The node of the tree is represented by the number 1. Each node V has two children: nodes indexed (2·V) and (2·V+1).
The edge from node I to node ⌊I / 2⌋ has W[I] weight.
Your task is to increase some edge weights so that the distance from root node 1 to all the leaf nodes is the same. Find the minimum sum of increments in the edges to make the distance from the root node to each leaf node equal.

Note: Node 1 is the root node.

Input Format
The first line contains an integer, N (height of the perfect binary tree having 2^(N+1) – 1 nodes).
The next line contains space-separated 2^(N+1) - 2 integers representing the weight of the edge between node i and node ⌊I / 2⌋.

Output Format
Print the minimum sum of increments in the edge weights as described in the problem statement.

Constraints
1 ≤ N ≤ 18
1 ≤ W[I] ≤ 10^6

Sample Testcase 0
Testcase Input
1
5 10
Testcase Output
5
Explanation
We can increase the edge weight between nodes 1 and 2 (5 to 10).
By doing this, the edge weights from 1 to 2 and from 1 to 3 will become equal. Hence the answer is 5.

Sample Testcase 1
Testcase Input
2
3 6 2 1 5 4
Testcase Output
8
Explanation
We can increase the weight of the edge between node 5 and node 2 to 2: an increase of 1.
Then, we can increase the weight of the edge between node 7 and node 3 to 5: an increase of 1.
Then, we can increase the weight of the edge between node 2 and node 1 to 9: an increase of 6.
Thus, all the paths from the root node to the leaf node will have the same length of 11.
So, an increase of 1+1+6 = 8 will be required in the edge weights.

-------------------------------------------- CODE ----------------------------------------------------------------------

import java.util.*;

public class Main {
    public static long minIncrement(int N, List<Integer> weights) {
        int totalNodes = (1 << (N + 1)) - 1;
        long[] W = new long[totalNodes + 1];
        for (int i = 2; i <= totalNodes; i++) {
            W[i] = weights.get(i - 2);
        }

        long[] maxPathSum = new long[totalNodes + 1];
        long totalIncrements = 0;

        for (int node = totalNodes; node > 0; --node) {
            if (2 * node > totalNodes) {
                maxPathSum[node] = 0;
            } else {
                int leftChild = 2 * node;
                int rightChild = 2 * node + 1;

                long leftPath = W[leftChild] + maxPathSum[leftChild];
                long rightPath = W[rightChild] + maxPathSum[rightChild];

                totalIncrements += Math.abs(leftPath - rightPath);
                maxPathSum[node] = Math.max(leftPath, rightPath);
            }
        }

        return totalIncrements;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int edgeCount = (1 << (N + 1)) - 2;
        List<Integer> weights = new ArrayList<>();
        for (int i = 0; i < edgeCount; i++) {
            weights.add(scanner.nextInt());
        }
        System.out.println(minIncrement(N, weights));
        scanner.close();
    }
}

*/