package CodeForces;

import java.util.Scanner;

public class CF_2140A_ShiftSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); sc.nextLine();
            char[] arr = sc.nextLine().toCharArray();
            int zCnt = 0;
            int oCnt = 0;
            for(char c : arr) {
                if (c=='1') oCnt++;
            }
            for (int j = arr.length-1; j >=0 ; j--) {
                if (arr[j]=='0') zCnt++;
                else oCnt--;
                if (zCnt >= oCnt) break;
            }
            System.out.println(Math.min(oCnt,zCnt));
        }
    }
}
