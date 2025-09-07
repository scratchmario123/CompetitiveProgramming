package AtCoder.ABC.ABC_422;

import java.util.Scanner;

public class ABC_422C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(); sc.nextLine();
            int max = 0;
            int minusB = Math.min(Math.min(a,c),b);
            max += minusB;
            a -= minusB;
            c -= minusB;
            if (a == 0 || c == 0) {
                System.out.println(max);
            } else {
                System.out.println(max + Math.min(Math.min(a,c),(a+c)/3));
            }

        }
    }
}
