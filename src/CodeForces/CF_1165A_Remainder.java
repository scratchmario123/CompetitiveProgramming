package CodeForces;

import java.util.Scanner;

public class CF_1165A_Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt(); sc.nextLine();
        String s = sc.nextLine();
        int cnt = 0;
        for (int i = n-1; i >= n-x; i--) {
            if (s.charAt(i) == '1') cnt++;
        }
        if (s.charAt(n-y-1) == '0') cnt++;
        else cnt--;
        System.out.println(cnt);
    }
}
