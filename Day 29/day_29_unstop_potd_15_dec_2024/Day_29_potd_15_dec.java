/*

https://unstop.com/code/practice/307827

You have been given a String ‘num’ Array. every string in the num Array is an anagram of every other string with the same length.
Check strings A and B are equal if we can swap Four letters (in different positions) of A so that it equals B. Also, two strings A and B are equal if they are equal.

For example, "store" and "rotse" are similar (if we swapping at positions 0 and 3 and 1 and 2),
and "ortse" and "stroe" are similar, but "tesro" is not similar to "rotse", "ortse" , "stroe".

If we connected this above form two groups {"rotse", "ortse" , "stroe"} and {"tesro"}.
Notice that "rotse" and "stroe" are in the same group despite not being similar.

Means a Single Group form even if at least one word equal to any word of that group

Note:- Single Word contains only one single Alphabetic Character

Return the number of groups form.

Input Format
The first Line contains the Stirng Array size Represented by `N` Integer
Second line contains the string array.

Output Format
Return the number of groups formed.

Constraints
0 <= num.length <= 2*10^2
1 <= num[i].length <=10^2

Sample Testcase 0
Testcase Input
2
carbon noacbr
Testcase Output
2
Explanation
group can form between carbon and noacbr

Sample Testcase 1
Testcase Input
4
rotse ortse stroe tesro
Testcase Output
2
Explanation
group can form between rotse ortse stroe and tesro


------------------------------------------------- CODE -----------------------------------------------

import java.util.*;

public class Main {
    public static int getAnagramGroups(List<String> strs) {

        Map<Integer, List<String>> lengthGroups = new HashMap<>();
        for (String s : strs) {
            lengthGroups.computeIfAbsent(s.length(), k -> new ArrayList<>()).add(s);
        }

        int totalGroups = 0;
        for (Map.Entry<Integer, List<String>> entry : lengthGroups.entrySet()) {
            List<String> group = entry.getValue();
            totalGroups += countGroups(group);
        }

        return totalGroups;
    }

    private static int countGroups(List<String> group) {
        int n = group.size();
        if (n == 0) return 0;
        if (n == 1) return 1;

        List<List<Integer>> adj = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (areEqual(group.get(i), group.get(j))) {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }

        boolean[] visited = new boolean[n];
        int components = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                components++;
                dfs(i, adj, visited);
            }
        }

        return components;
    }

    private static void dfs(int node, List<List<Integer>> adj, boolean[] visited) {
        Stack<Integer> stack = new Stack<>();
        stack.push(node);
        visited[node] = true;

        while (!stack.isEmpty()) {
            int u = stack.pop();
            for (int v : adj.get(u)) {
                if (!visited[v]) {
                    visited[v] = true;
                    stack.push(v);
                }
            }
        }
    }
    private static boolean areEqual(String a, String b) {
        if (a.equals(b)) return true;

        int diffCount = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                diffCount++;
                if (diffCount > 4) return false;
            }
        }

        return diffCount == 4;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println(0);
            return;
        }

        List<String> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.next());
        }

        int groups = getAnagramGroups(arr);
        System.out.println(groups);
    }
}


 */