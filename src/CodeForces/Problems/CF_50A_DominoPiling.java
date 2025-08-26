package CodeForces.Problems;

import java.util.Scanner;

public class CF_50A_DominoPiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println((m*n-m*n%2)/2);

    }
}
