package CodeForces.Problems;

import java.util.Scanner;

public class CF_282A_BitPlusPlus {
    public static void main(String[] args) {
        int x = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String op = sc.nextLine();
            if (op.contains("--")) x--;
            else x++;
        }
        System.out.println(x);
    }
}
