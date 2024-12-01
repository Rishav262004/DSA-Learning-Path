/*

https://unstop.com/code/practice/303834

Jack enjoys playing his favorite game, Enemy Exodus, which features N groups of enemies,
with the i-th group containing group[i]  enemies.

There's a critical point in the game: after M minutes, the enemies activate a super shield headquarters
that makes them invulnerable. Jack knows this and wants to eliminate all enemies before the shield is activated.

Each minute, he can decide on a kill rate K, which represents the number of enemies he will attempt to kill from a chosen group.
If a group has fewer than K enemies, he will kill all remaining enemies in that group for that minute.
Jack prefers to kill enemies slowly but must still finish off all of them before the shield activates.

The task is to determine the minimum integer value of K that allows him to kill all enemies within the M minutes and convert this

-------------------------------------------- CODE --------------------------------------------------

import java.util.Scanner;

public class EnemyExodus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int N = sc.nextInt();
        int[] group = new int[N];
        for (int i = 0; i < N; i++) {
            group[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        
        int low = 1;
        int high = getMax(group);
        int result = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (canKillAll(group, mid, M)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        

        if (result == -1) {
            System.out.println("1");
        } else {
            System.out.println(result + " " + Integer.toOctalString(result));
        }
    }
    
    private static int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            max = Math.max(max, num);
        }
        return max;
    }

    private static boolean canKillAll(int[] group, int K, int M) {
        int totalTime = 0;
        for (int enemies : group) {

            totalTime += (enemies + K - 1) / K;
            if (totalTime > M) return false;
        }
        return totalTime <= M;
    }
}

 */