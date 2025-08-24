package CodeForces;

import java.util.Scanner;

public class CF_231A_Team {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int res = 0;
        for (int i = 0; i < n; i++) {
            String[] s = scanner.nextLine().split(" ");
            if ((s[0].equals("1") ? 1 : 0 )+ (s[1].equals("1") ? 1 : 0 )+(s[2].equals("1") ? 1 : 0 ) >= 2) {
                res++;
            }
        }
        System.out.println(res);
        scanner.close();
    }
}
