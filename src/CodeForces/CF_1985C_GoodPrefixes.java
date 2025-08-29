package CodeForces;

import java.util.Scanner;

public class CF_1985C_GoodPrefixes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); sc.nextLine();

            long sum = 0;
            int cnt = 0;
            long max = 0;
            for (int j = 0; j < n; j++) {
                long num = sc.nextLong();
                sum += num;
                if (num > max) max = num;
                if (sum == 2L *max) cnt++;
            }
            sc.nextLine();
            System.out.println(cnt);
        }
    }
}
