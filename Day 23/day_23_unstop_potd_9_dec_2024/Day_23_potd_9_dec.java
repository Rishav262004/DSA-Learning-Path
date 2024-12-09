/*

https://unstop.com/code/practice/250653

Raj is a very good content writer. He usually writes repetitive words with some acronym so that
he can save time and make a key-value pair list at the end of any report, or written document.
Here the key denotes the acronym while the value is the corresponding value of the acronym.
You are a junior assistant of Raj. You have to replace all the acronyms with their value.
If any acronym is not found in the list of key-value pairs then replace it with “?”.
Note: All acronyms are enclosed with brackets “(“ and “)”.

Input Format
The first line contains string S.
The second line contains N, which is the size of key-value pairs
Next N lines contain two strings as the first string will be key while the second string will be value.

Output Format
A string replaced with the value of the acronyms

Constraints
6<=s.length<=10^3
0<=n<=15

0<=length(any_string_of_pair)<= 100

Note: any trailing spaces at the end of your output will be count as wrong answer.

Sample Testcase 0
Testcase Input
hello(name)
1
age five
Testcase Output
hello?
Explanation
name is special msg but it's value is not available
then the name is replaced by “?”.
Sample Testcase 1
Testcase Input
(name)is(age)yearsold
2
name Mukesh
age fifty
Testcase Output
Mukeshisfiftyyearsold
Explanation
(name) and (age) are special msgs The value of the name in “Mukesh” and The value of age is “fifty”

-------------------------------------------------------- CODE ----------------------------------------------------------

import java.util.*;

public class Main {

    public static String specialmsg(String s, Map<String, String> vocab) {
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < s.length()) {
            if (s.charAt(i) == '(') {
                int j = i + 1;
                while (j < s.length() && s.charAt(j) != ')') {
                    j++;
                }

                if (j < s.length() && s.charAt(j) == ')') {
                
                    String key = s.substring(i + 1, j);

                    
                    result.append(vocab.getOrDefault(key, "?"));

                    
                    i = j + 1;
                } else {
                    
                    result.append("(");
                    i++;
                }
            } else {
                
                result.append(s.charAt(i));
                i++;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int size = sc.nextInt();
        
        Map<String, String> vocab = new HashMap<>();
        for (int i = 0; i < size; i++) {
            String key = sc.next();
            String value = sc.next();
            vocab.put(key, value);
        }

        String ans = specialmsg(s, vocab);
        System.out.println(ans);

        sc.close();
    }
}


*/