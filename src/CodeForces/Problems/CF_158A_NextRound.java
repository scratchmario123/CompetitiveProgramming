package CodeForces.Problems;

import java.util.Scanner;

public class CF_158A_NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        int cnt = 0;
        int kScore = 0;
        for (int i = 1; i <= n; i++) {
            int score = sc.nextInt();
            if (i <= k && score > 0) {
                if (i == k) kScore = score;
                cnt++;
            } else if (i > k) {
                if (score > 0 && kScore == score) cnt++;
            } else break;
        }
        System.out.println(cnt);
    }
}
