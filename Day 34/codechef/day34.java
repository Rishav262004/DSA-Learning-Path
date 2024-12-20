/*

https://www.codechef.com/practice/course/binary-search/INTBINS01/problems/SHKNUM

Sheokand and Number

------------------------------------- CODE ---------------------------------------------------------

import java.util.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        
        
        TreeSet<Long> validMs = precomputeValidMs();

        int T = Integer.parseInt(br.readLine());

        
        while (T-- > 0) {
            long N = Long.parseLong(br.readLine());
            
            long closestM = findClosestM(validMs, N);
            
            long minOperations = Math.abs(N - closestM);
            output.append(minOperations).append("\n");
        }
        

        System.out.print(output);
    }

    private static TreeSet<Long> precomputeValidMs() {
        TreeSet<Long> validMs = new TreeSet<>();
        
        for (int x = 0; x <= 31; x++) {
            for (int y = 0; y <= 31; y++) {
                if (x != y) {
                    long M = (1L << x) + (1L << y);
                    validMs.add(M);
                }
            }
        }
        return validMs;
    }

    private static long findClosestM(TreeSet<Long> validMs, long N) {
        
        Long floor = validMs.floor(N);
        Long ceiling = validMs.ceiling(N);

        if (floor == null) return ceiling;
        if (ceiling == null) return floor;

        
        return Math.abs(floor - N) <= Math.abs(ceiling - N) ? floor : ceiling;
    }
}



 */