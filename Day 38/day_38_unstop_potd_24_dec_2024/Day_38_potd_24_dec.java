/*

https://unstop.com/code/practice/250927

Kala is the director of an engineering college.

He makes the decision for college based on the previous decision. 
Unfortunately, the latest decision of Kala for college is wrong. 
Since each decision for college is based on the previous decision, all the decisions after a wrong decision are also wrong.

Kala is worried about the wrong decision. So, he wants to find out the first wrong decision, 
which causes all the following decisions to be wrong.

Kala needs your help to find out the answer. Print -1 if there is no wrong decision.

Input Format
First line of the input contains a string.

The string consists of only upper case 'C' and 'W' letters.' C' means the decision is correct, and 'W' means the decision is wrong.

Output Format
Print an integer, which is the index of the first wrong decision.

Constraints
1<=Length of String<=10^8
String consists of only upper case C and W letters.
Index of the string starts from 0.
Sample Testcase 0
Testcase Input
CCWW
Testcase Output
2
Explanation
First wrong decision, i.e. 'W' is present at index 2. So, the output is 2.

Sample Testcase 1
Testcase Input
WWWWW
Testcase Output
0
Explanation
First wrong decision, i.e. 'W' is present at index 0. So, the output is 0

------------------------------------------------------ CODE ------------------------------------------------------------

import java.util.Scanner;

public class Main {
    public static int FirstWrongDecision(String s) {
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'W') {
                return i; 
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(FirstWrongDecision(str));
        scanner.close();
    }
}

*/