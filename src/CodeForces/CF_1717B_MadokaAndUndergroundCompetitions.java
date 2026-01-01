package CodeForces;

import java.util.*;

public class CF_1717B_MadokaAndUndergroundCompetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt(), r = sc.nextInt(), c = sc.nextInt(); sc.nextLine();
            int startC = ((c-r+n)%n+1)%k;
            int curStartC = startC;
            boolean start = false;
            for (int j = 1; j <= n; j++) {
                for (int l = 1; l <= n; l++) {
                    if (!start && l == startC) {
                        start = true;
                        System.out.print("X");
                    } else if ((l-curStartC)%k == 0) {
                        System.out.print("X");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.print("\n");
                curStartC++;
                curStartC = (curStartC-1)%n+1;
            }
        }
    }
}
