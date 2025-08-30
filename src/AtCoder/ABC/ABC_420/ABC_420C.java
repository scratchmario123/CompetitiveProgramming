package AtCoder.ABC.ABC_420;

import java.util.Scanner;

public class ABC_420C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        sc.nextLine();
        long[] a = new long[n];
        long[] b = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextLong();
        }
        sc.nextLine();

        long min = 0;
        for (int i = 0; i < n; i++) {
            min += Math.min(a[i], b[i]);
        }

        for (int i = 0; i < q; i++) {
            String c = sc.next();
            int x = sc.nextInt()-1;
            long v = sc.nextLong();

            min -=Math.min(a[x], b[x]);
            if (c.equals("A")) {
                a[x] = v;
                min += Math.min(a[x], b[x]);
            } else {
                b[x] = v;
                min += Math.min(a[x], b[x]);
            }
            System.out.println(min);
            if (sc.hasNextLine()) sc.nextLine();
        }
    }
}
