package CodeForces;

import java.util.Scanner;

public class CF_2137B_FunPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt(); sc.nextLine();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); sc.nextLine();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            sc.nextLine();
            for (int j = 0; j < n; j++) {
                if (j != 0) System.out.print(" ");
                System.out.print(1+n-arr[j]);
            }
            System.out.println();
        }
    }
}
