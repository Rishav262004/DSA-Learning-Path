/*

Convert String to Title Case

https://www.codechef.com/practice/course/strings/STRINGS/problems/TITLECASE\

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        
        int T = Integer.parseInt(sc.nextLine());


        while (T-- > 0) {
            String input = sc.nextLine();
            System.out.println(convertToTitleCase(input));
        }
    }

    
    private static String convertToTitleCase(String s) {
        StringBuilder result = new StringBuilder();
        String[] words = s.split(" ");

        for (String word : words) {
            if (isAcronym(word)) {
                
                result.append(word);
            } else {
                
                result.append(Character.toUpperCase(word.charAt(0)))
                .append(word.substring(1).toLowerCase());
            }
            result.append(" ");
        }

        
        return result.toString().trim();
    }

    
    private static boolean isAcronym(String word) {
        for (char c : word.toCharArray()) {
            if (!Character.isUpperCase(c)) {
                return false;
            }
        }
        return true;
    }
}

 */