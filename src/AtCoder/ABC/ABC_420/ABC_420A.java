package AtCoder.ABC.ABC_420;

import java.util.Scanner;

class ABC_420A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        System.out.println((a+b-1)%12+1);
    }
}
