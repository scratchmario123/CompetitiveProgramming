package CodeForces;

import java.util.Scanner;

public class CF_2030B_MinimiseOneness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); sc.nextLine();
            String ans = "1";
            ans = ans + new String(new char[n-1]).replace("\0","0");
            System.out.println(ans);
        }
    }
}
