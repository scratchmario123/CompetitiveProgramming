package CodeForces.Contests;

import java.util.Scanner;

public class CF_2094A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++){
            String[] s = sc.nextLine().split(" ");
            String ans = "";
            for (String ss : s) {
                ans += ss.charAt(0);
            }
            System.out.println(ans);
        }
    }
}
