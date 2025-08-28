package CodeForces;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class CF_1829D_GoldRush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        big:
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), m = sc.nextInt(); sc.nextLine();
            if (n == m) {
                System.out.println("YES");
                continue;
            }
            if (n%3!=0 || m > n) {
                System.out.println("NO");
                continue;
            }

            Queue<Integer> q = new ArrayDeque<>();
            q.add(n);
            while (!q.isEmpty()) {
                int num = q.remove();
                if (num == m) {
                    System.out.println("YES");
                    continue big;
                }
                if (num%3==0) {
                    q.add(num*2/3);
                    q.add(num/3);
                }
            }
            System.out.println("NO");
        }
    }
}
