package CodeForces;

import java.util.Scanner;

public class CF_2148C_Pacer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), m = sc.nextInt(); sc.nextLine();
            int lastMin = 0;
            int lastLoc = 0;
            long pnt = 0;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt(), b = sc.nextInt(); sc.nextLine();
                if ((a-lastMin)%2==0) {
                    if (lastLoc == b) pnt += (a-lastMin);
                    else pnt += (a-lastMin-1);
                } else {
                    if (lastLoc == b) pnt += (a-lastMin-1);
                    else pnt += (a-lastMin);
                }
                m-=(a-lastMin);
                lastMin = a;
                lastLoc = b;
            }
            System.out.println(pnt + m);
        }
    }
}
