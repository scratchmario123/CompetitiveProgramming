package CodeForces;

import java.util.Scanner;

public class CF_2130B_Pathless {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), s = sc.nextInt(); sc.nextLine();
            int sum = 0;
            int zeroCnt = 0;
            int oneCnt = 0;
            int twoCnt = 0;
            for (int j = 0; j < n; j++) {
                int k = sc.nextInt();
                if (k==0) zeroCnt++;
                else if (k == 1) oneCnt++;
                else twoCnt++;
                sum += k;
            }
            if (s < sum) printAns(oneCnt,twoCnt,zeroCnt);
            else if (s == sum) System.out.println(-1);
            else if (s-sum > 1) System.out.println(-1);
            else {
                printAns(oneCnt,twoCnt,zeroCnt);
            }
            sc.nextLine();
        }
    }

    static void printAns(int a, int b, int c) {
        for (int i = 0; i < a; i++) {
            System.out.print(1 + " ");
        }
        for (int i = 0; i < b; i++) {
            System.out.print(2 + " ");
        }
        for (int i = 0; i < c; i++) {
            System.out.print(0 + " ");
        }
        System.out.println();
    }
}
