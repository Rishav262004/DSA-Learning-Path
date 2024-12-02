/*

https://www.codechef.com/practice/course/amazon-interview-questions/AMAZONPREP/problems/PATSEARCH

Find the Pattern

import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);


        int T = sc.nextInt();
        sc.nextLine(); 


        while (T-- > 0) {
            String S = sc.nextLine();
            String P = sc.nextLine();

            System.out.println(kmpSearch(S, P) ? 1 : 0);
        }

        sc.close();
    }

    // KMP Search Algorithm
    public static boolean kmpSearch(String text, String pattern) {
        int[] lps = computeLPS(pattern);
        int i = 0, j = 0;
        while (i < text.length()) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }

            if (j == pattern.length()) {
    
                return true;
            } else if (i < text.length() && text.charAt(i) != pattern.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        
        return false;
    }


    public static int[] computeLPS(String pattern) {
        int[] lps = new int[pattern.length()];
        int length = 0;
        int i = 1;

        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = lps[length - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }
}


 */