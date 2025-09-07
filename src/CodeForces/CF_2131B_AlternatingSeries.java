package CodeForces;

import java.util.Scanner;

public class CF_2131B_AlternatingSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); sc.nextLine();
            for (int j = 0; j < n; j++) {
                if (j != 0) System.out.print(" ");
                if (j%2==0) System.out.print(-1);
                else System.out.print( n == 2 ? 2 : (j == n-1 ? 2 : 3));
            }
            System.out.println();
        }
    }
}
