/*

https://www.codechef.com/practice/course/strings/STRINGS/problems/WCC

World Chess Championship

----------------------------------------------- CODE -------------------------------------------------------

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        
        for(int _t = 0; _t < T; _t++){
            int X = Integer.parseInt(br.readLine().trim());
            String results = br.readLine().trim();

            int carlsenPoints = 0;
            int chefPoints = 0;

            
            for (int i = 0; i < 14; i++) {
                char c = results.charAt(i);
                if (c == 'C') {
                    carlsenPoints += 2;
                } else if (c == 'N') {
                    chefPoints += 2;
                } else if (c == 'D') {
                    carlsenPoints += 1;
                    chefPoints += 1;
                }
            }

            
            if (carlsenPoints > chefPoints) {
        
                System.out.println(60 * (long)X);
            } else if (carlsenPoints < chefPoints) {

                System.out.println(40 * (long)X);
            } else {

                System.out.println(55 * (long)X);
            }
        }
    }
}


*/