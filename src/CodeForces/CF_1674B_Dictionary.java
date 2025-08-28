package CodeForces;

import java.util.Scanner;

public class CF_1674B_Dictionary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();
            System.out.println((s.charAt(0)-97)*25+(s.charAt(1)>s.charAt(0) ? s.charAt(1)-98 : s.charAt(1)-97) + 1);
        }
    }
}
