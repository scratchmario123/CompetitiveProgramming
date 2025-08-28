package CodeForces;

import java.util.Scanner;

public class CF_2111A_EnergyCrystals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            sc.nextLine();
            int[] c = new int[3];

            int cnt = 0;
            int j = 0;
            while (c[0] < k || c[1] < k || c[2] < k) {
                int min = Math.min(c[0],Math.min(c[1],c[2]));
                int max = Math.max(c[0],Math.max(c[1],c[2]));
                if (c[j] == min) {
                    c[j] = 2*(c[0]+c[1]+c[2]-min-max)+1;
                    cnt++;
                }
                j = (j+1)%3;
            }
            System.out.println(cnt);
        }
    }
}
