package CodeForces;

import java.util.Scanner;

public class CF_2148B_Lasers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), m = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt(); sc.nextLine();
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                if (a <= y) cnt++;
            } sc.nextLine();
            for (int j = 0; j < m; j++) {
                int b = sc.nextInt();
                if (b <= x) cnt++;
            } sc.nextLine();
            System.out.println(cnt);
        }
    }
}
