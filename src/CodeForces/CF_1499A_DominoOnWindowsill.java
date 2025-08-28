package CodeForces;

import java.util.Scanner;

public class CF_1499A_DominoOnWindowsill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k1 = sc.nextInt(), k2 = sc.nextInt(); sc.nextLine();
            int w = sc.nextInt(), b = sc.nextInt(); sc.nextLine();
            if (Math.abs(k1-k2)/2+Math.min(k1,k2) < w || Math.abs(k1-k2)/2+Math.min(n-k1,n-k2) < b) {
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");
        }
    }
}
