/*

https://www.geeksforgeeks.org/problems/print-anagrams-together/1


Print Anagrams Together

Given an array of strings, return all groups of strings that are anagrams.
The groups must be created in order of their appearance in the original array. Look at the sample case for clarification.

Note: The final output will be in lexicographic order.

Examples:

Input: arr[] = ["act", "god", "cat", "dog", "tac"]
Output: [["act", "cat", "tac"], ["god", "dog"]]
Explanation: There are 2 groups of anagrams "god", "dog" make group 1. "act", "cat", "tac" make group 2.
Input: arr[] = ["no", "on", "is"]
Output: [["is"], ["no", "on"]]
Explanation: There are 2 groups of anagrams "is" makes group 1. "no", "on" make group 2.
Input: arr[] = ["listen", "silent", "enlist", "abc", "cab", "bac", "rat", "tar", "art"]
Output: [["abc", "cab", "bac"], ["listen", "silent", "enlist"], ["rat", "tar", "art"]]
Explanation:
Group 1: "abc", "bac", and "cab" are anagrams.
Group 2: "listen", "silent", and "enlist" are anagrams.
Group 3: "rat", "tar", and "art" are anagrams.

------------------------------------------------------- CODE -----------------------------------------------------------


class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        TreeMap<String, ArrayList<String>> mp = new TreeMap<>();
        int n = arr.length;
        
        for (String s : arr) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);
            
            mp.putIfAbsent(str, new ArrayList<>());
            mp.get(str).add(s);
        }
        
        return new ArrayList<>(mp.values());
    }
}

*/