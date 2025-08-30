package AtCoder.ABC.ABC_421;

import java.util.Scanner;

public class ABC_421A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        String[] arr = new String[n+1];
        for (int i = 1; i < n+1; i++) {
            arr[i] = sc.nextLine();
        }
        int x = sc.nextInt();
        String y = sc.next();
        if (arr[x].equals(y)) System.out.println("Yes");
        else System.out.println("No");
    }
}
