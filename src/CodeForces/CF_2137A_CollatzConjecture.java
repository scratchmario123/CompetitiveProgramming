package CodeForces;

import java.util.Scanner;

public class CF_2137A_CollatzConjecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < t; i++) {
            long k = sc.nextLong(), x = sc.nextLong(); sc.nextLine();
            for (int j = 0; j < k; j++) {
                if (x!= 1 && (x-1)%3==0 && ((x-1)/3)%2!=0) {
                    x = (x-1)/3;
                }
                else x*=2;
            }
            System.out.println(x);
        }
    }
}
