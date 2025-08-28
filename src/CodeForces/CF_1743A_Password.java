package CodeForces;

import java.util.Scanner;

public class CF_1743A_Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); sc.nextLine();
            for (int j = 0; j < n; j++) {
                sc.nextInt();
            }
            sc.nextLine();
            System.out.println(6*(10-n)*(9-n)/2);
        }
    }
}
