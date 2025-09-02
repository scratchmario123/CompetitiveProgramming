package CodeForces;

import java.util.Scanner;

public class CF_2134B_Add0OrK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); long k = sc.nextLong(); sc.nextLine();
            long[] arr = new long[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextLong();
            }
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j] + k * (arr[j]%(k+1)) + " ");
            }
            System.out.println();
            sc.nextLine();
        }
    }
}
