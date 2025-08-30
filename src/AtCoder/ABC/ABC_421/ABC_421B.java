package AtCoder.ABC.ABC_421;

import java.util.Scanner;

public class ABC_421B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a1 = sc.nextLong(), a2 = sc.nextLong();
        for (int i = 0; i < 8; i++) {
            long a3 = reverse(a1+a2);
            a1 = a2;
            a2 = a3;
        }
        System.out.println(a2);
    }

    static long reverse(long x) {
        long newNum = 0;
        while (x > 0) {
            newNum = newNum * 10 + x%10;
            x/=10;
        }
        return newNum;
    }
}
