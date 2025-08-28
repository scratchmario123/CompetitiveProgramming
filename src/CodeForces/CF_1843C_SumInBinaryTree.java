package CodeForces;

import java.util.Scanner;

public class CF_1843C_SumInBinaryTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong(); sc.nextLine();
            long sum = 0;
            while (n != 0) {
                sum += n;
                n >>=1;
            }
            System.out.println(sum);
        }
    }
}
