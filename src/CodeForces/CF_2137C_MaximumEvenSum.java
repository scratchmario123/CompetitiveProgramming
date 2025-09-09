package CodeForces;

import java.util.Scanner;

public class CF_2137C_MaximumEvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < t; i++) {
            long a = sc.nextLong(), b = sc.nextLong(); sc.nextLine();
            if (a%2==0 && b%2==0) System.out.println(a*b/2+2);
            else if (a%2==1 && b%4==0) System.out.println(a*b/2+2);
            else if (a%2==1 && b%2==1) System.out.println(a*b+1);
            else System.out.println(-1);
        }
    }
}
