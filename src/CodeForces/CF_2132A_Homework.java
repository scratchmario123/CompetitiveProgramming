package CodeForces;

import java.util.Scanner;

public class CF_2132A_Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); sc.nextLine();
            String a = sc.nextLine();
            int m = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            for (int j = 0; j < c.length(); j++) {
                if (c.charAt(j) == 'V') {
                    a = b.substring(j,j+1) + a;
                } else {
                    a+= b.substring(j,j+1);
                }
            }
            System.out.println(a);
        }
    }
}
