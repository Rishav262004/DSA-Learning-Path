/*

https://unstop.com/code/practice/261363

Alice is playing a game in which she has been given several strings and has been provided with a list of numbers. Robert would burst a balloon K times. Each time Robert burst a balloon, Robert is to Replace the list numbers by the additive inverse of the number.

When completed, Alice would get the maximum possible sum of Alice's numbers as prize money.

Print the prize money Alice would get.

Input Format
The first line contains two space separated integers N and K.

The second line contains N spce-seprated integers denoting the elements of the array.

Output Format
Display an integer denoting the maximum sum Alice can get after K operations.

Constraints
1 ≤ N,K ≤ 105

-109 ≤ Ai ≤ 109

Sample Testcase 0
Testcase Input
4 3
9 8 8 5
Testcase Output
20
Explanation
1. Replace (5) by (-5), array becomes {9,8,8,-5}


2. Replace (-5) by -(-5), array becomes {9,8,8,5}


3. Replace (5) by (-5), array becomes {9,8,8,-5}


Here, the sum of the array is 20 which is the maximum possible.

--------------------------------------------------------------------------------------------------------------------------

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for (int i = 0; i < N && K > 0; i++) {
            if (arr[i] < 0) {
                arr[i] = -arr[i];
                K--;
            }
        }
        if (K % 2 == 1) {
            Arrays.sort(arr);
            arr[0] = -arr[0];
        }

        int maxSum = 0;
        for (int num : arr) {
            maxSum += num;
        }
        System.out.println(maxSum);
    }
}


 */