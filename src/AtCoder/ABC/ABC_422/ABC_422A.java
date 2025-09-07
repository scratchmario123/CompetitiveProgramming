package AtCoder.ABC.ABC_422;

import java.util.Scanner;

public class ABC_422A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = Integer.parseInt(s.split("-")[0]);
        int j = Integer.parseInt(s.split("-")[1]);
        System.out.println((j == 8 ? i+1 : i) + "-" + (j == 8 ? 1 : j+1));
    }
}
