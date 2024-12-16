/*

https://www.codechef.com/practice/course/strings/STRINGS/problems/HAPPYSTR

Chef and Happy String

----------------------------------------- CODE --------------------------------------------------------

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String vowels = "aeiou";

        while (t-- > 0) {
            String s = scanner.next();
            int count = 0;
            boolean happy = false;
            
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                // Check if c is a vowel by seeing if it's found in vowels string
                if (vowels.indexOf(c) != -1) {
                    count++;
                    if (count > 2) {
                        happy = true;
                        break;
                    }
                } else {
                    count = 0;
                }
            }

            System.out.println(happy ? "HAPPY" : "SAD");
        }
    }
}


 */