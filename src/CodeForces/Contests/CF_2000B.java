package CodeForces.Contests;

import java.util.Scanner;

public class CF_2000B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        big:
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            String[] s = sc.nextLine().split(" ");
            int min = 0;
            int max = 0;
            for (int j = 0; j < n; j++) {
                int p = Integer.parseInt(s[j]);
                if (j == 0) {
                    min = p; max = p;
                } else {
                    if (Math.abs(p-max) != 1 && Math.abs(p-min) != 1) {
                        System.out.println("NO");
                        continue big;
                    }
                    if (p > max) max = p;
                    if (p < min) min = p;
                }
            }
            System.out.println("YES");
        }
    }
}
