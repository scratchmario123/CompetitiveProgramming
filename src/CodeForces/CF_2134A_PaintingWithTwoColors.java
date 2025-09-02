package CodeForces;

import java.util.Scanner;

public class CF_2134A_PaintingWithTwoColors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(); sc.nextLine();
            if (n%2 == 0) {
                if (a%2==1) {
                    if (b <= a || b%2 == 1) {
                        System.out.println("NO");
                        continue;
                    }
                } else if (b%2 == 1) {
                    System.out.println("NO");
                    continue;
                }
            } else {
                if (a%2==0) {
                    if (b <= a || b%2 == 0) {
                        System.out.println("NO");
                        continue;
                    }
                } else if (b%2 == 0) {
                    System.out.println("NO");
                    continue;
                }
            }

            System.out.println("YES");

        }
    }
}
