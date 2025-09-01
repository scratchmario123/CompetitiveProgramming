package CodeForces;

import java.util.Scanner;

public class CF_2133A_Redstone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); sc.nextLine();
            int[] gears = new int[n];
            for (int j = 0; j < n; j++) {
                gears[j] = sc.nextInt();
            }

            boolean found = false;
            big:
            for (int a = 0; a < n; a++) {
                for (int b = 0; b < n; b++) {
                    if (a != b && gears[a]*1.0/gears[b] == 1) {
                        found = true;
                        break big;
                    }
                }
            }
            if (found) System.out.println("YES");
            else System.out.println("NO");

            sc.nextLine();
        }
        
    }
}
