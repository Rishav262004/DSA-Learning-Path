/*

https://unstop.com/code/practice/299511

You are given two numbers in the form of linked lists, where the digits are in reverse order.

One of these numbers will always be a single-digit number.

The task is to multiply these two numbers and return the result in reverse order in the form of a linked list

Input Format
The first line of input contains an integer N, representing the first linked list.

The Second line of input contains an integer M, representing the second linked list. 

Output Format
Display the multiplied result as a string of digits in reverse order, which corresponds to the linked list.

Constraints
0 ≤  N , M ≤10^6

Sample Testcase 0
Testcase Input
123
5
Testcase Output
1605
Explanation
As mentioned in the question, the numbers will look something like this as a LinkedList. 3 -> 2 ->1->null. 
5->null. Output: 5->0->6->1. Now this list is in reverse format after reversing, the answer will be 1605.

Sample Testcase 1
Testcase Input
23
7
Testcase Output
224
Explanation
As mentioned in the question, the numbers will look something like this as a LinkedList. 3->2->null. 
7->null. Output: 4 -> 2 -> 2. Now this list is in reverse format, after reversing the answer will be 224.

-------------------------------------- code ----------------------------------------------------------------


import java.io.*;

import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String num1_str = sc.nextLine().trim();

        String num2_str = sc.nextLine().trim();


        StringBuilder sb_num1 = new StringBuilder(num1_str);
        StringBuilder sb_num2 = new StringBuilder(num2_str);

        String reversed_num1 = sb_num1.reverse().toString();
        String reversed_num2 = sb_num2.reverse().toString();

        BigInteger num1 = new BigInteger(reversed_num1);
        BigInteger num2 = new BigInteger(reversed_num2);

        BigInteger product = num1.multiply(num2);


        String product_str = product.toString();

        System.out.println(product_str);
    }
}





*/