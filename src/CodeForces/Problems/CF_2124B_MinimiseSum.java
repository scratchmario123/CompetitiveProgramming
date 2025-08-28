package CodeForces.Problems;

import java.util.Scanner;

public class CF_2124B_MinimiseSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt(); sc.nextLine();
            int lastNum = sc.nextInt();
            int sum = lastNum;
            for (int j = 0; j < n-1; j++) {
                int num = sc.nextInt();
                if (n == 2) {
                    sum = lastNum +Math.min(lastNum,num);
                    break;
                }
                if (num <= lastNum || j!= 0) {
                    if (j==0) sum = lastNum+num;
                    else sum += lastNum;
                    break;
                }
            }
            System.out.println(sum);
            sc.nextLine();
        }
    }
}
