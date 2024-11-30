/*

https://unstop.com/code/practice/298225

A city has N landmarks and N-1 paths. From any landmark there is path to every other landmark.
There is a carhop owner with N cars numbered from 1 to N.

He wants to visit all the paths and for every path he knows whether the path is visited or not.
If the with car is selected it will visit all the path from ith landmark to 1st landmark which is the rooted landmark of the city.

Select minimum number of cars to visit all the paths.

Input Format
The first line consist of N the number of landmarks.
The next N-1 lines contain u,v and c where u and v are connected path and if c is 1 then {u,v} is
visited and if c is 0 then it is not visited.
NOTE:The paths represent a tree.

Output Format
Print the minimum number of cars to visit all the paths.


--------------------------------------- code --------------------------------------

import java.util.*;

public class Main {
    static List<List<Pair>> adj;
    static boolean[] vis;
    static int ans = 0;

    static class Pair {
        int node;
        int weight;

        Pair(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }

    static boolean dfs(int curr) {
        vis[curr] = true;
        boolean needsCar = false;

        for (Pair neighbor : adj.get(curr)) {
            int nextNode = neighbor.node;
            int weight = neighbor.weight;

            if (vis[nextNode]) continue;

            if (weight == 0) {
                if (dfs(nextNode)) {
                    needsCar = true;
                } else {
                    needsCar = true;
                    ans++;
                }
            } else {
                if (dfs(nextNode)) {
                    needsCar = true;
                }
            }
        }

        return needsCar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        adj = new ArrayList<>();
        for (int i = 0; i < n; i++) { // Zero-based indexing
            adj.add(new ArrayList<>());
        }

        vis = new boolean[n];

        for (int i = 0; i < n - 1; ++i) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            --a; --b; // Convert to zero-based indexing

            adj.get(a).add(new Pair(b, c));
            adj.get(b).add(new Pair(a, c));
        }

        dfs(0);

        System.out.println(ans);
    }
}

*/