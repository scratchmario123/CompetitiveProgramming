package CodeForces;

import java.util.Scanner;

public class CF_2148A_SublimeSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt(), n = sc.nextInt(); sc.nextLine();
            if (n%2==0) System.out.println(0);
            else System.out.println(x);

        }
    }
}
