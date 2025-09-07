package CodeForces;

import java.util.Scanner;

public class CF_2131A_Lever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt(); sc.nextLine();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt(); sc.nextLine();
            int[] arrA = new int[n];
            int[] arrB = new int[n];
            for (int j = 0; j < n; j++) {
                arrA[j] = sc.nextInt();
            }
            sc.nextLine();
            for (int j = 0; j < n; j++) {
                arrB[j] = sc.nextInt();
            }
            sc.nextLine();

            int m = 0;
            for (int j = 0; j < n; j++) {
                if (arrA[j] > arrB[j]) m += arrA[j]-arrB[j];
            }
            System.out.println(m+1);
        }
    }
}
