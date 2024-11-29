/*

https://unstop.com/code/practice/250898


There are N suns in a galaxy, each sun has M planets, each of the M planets have some number of moons, 
denoted by galaxy(i)(j), where galaxy(i)(j) denotes the number of moons of the jth planet having the ith sun.

Your task is to determine the maximum number of moons in any solar system. For each sun, 
calculate the total number of moons across all its planets, and output the highest total number of moons 
found in a single solar system.

Input Format
The first line of input contains two space-separated integers, N and M, 
representing the number of suns and the number of planets per sun, respectively.

The next N lines of input contains M space separated integers, representing the number of moons 
for each planet around the respective sun.

Output Format
Display a  single integer denoting the maximum total number of moons in a solar system 
(i.e., across all planets orbiting the same sun).

Constraints
1<=N<=5*10^2

1<=M<=5*10^2

1<=galaxy(i)(j) <=10^4

Sample Testcase 0
Testcase Input
2 3
1 2 3
4 5 6
Testcase Output
15


------------------------------------------------- CODE ------------------------------------------------------


import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] galaxy = new int[N][M];

        for (int i = 0; i < N; i++) { 
            for (int j = 0; j < M; j++) {
                galaxy[i][j] = sc.nextInt();
            }
        }

        int maxMoons = 0;

        for (int i = 0; i < N; i++) {
            int totalMoons = 0;
            for (int j = 0; j < M; j++) {
                totalMoons += galaxy[i][j];
            }
            maxMoons = Math.max(maxMoons, totalMoons); 
        }
        System.out.println(maxMoons);
    }
}





*/