package CodeForces;

import java.util.Scanner;

public class CF_1288A_Deadline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        big:
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int d = sc.nextInt();
            sc.nextLine();

            if (d <= n) {
                System.out.println("YES");
                continue;
            }
            //ternary search required...
            int left = 1;
            int right = n;
            while (left <= right) {
                int mid1 = left + (right-left)/3;
                int mid2 = right - (right-left)/3;
                if (mid1 + Math.ceil(d*1.0/(mid1+1))<= n || mid2 + Math.ceil(d*1.0/(mid2+1))<= n) {
                    System.out.println("YES");
                    continue big;
                } else if (mid1 + Math.ceil(d*1.0/(mid1+1))< mid2 + Math.ceil(d*1.0/(mid2+1))) {
                    right = mid2-1;
                } else if (mid1 + Math.ceil(d*1.0/(mid1+1)) > mid2 + Math.ceil(d*1.0/(mid2+1))){
                    left = mid1+1;
                } else {
                    left  = mid1+1;
                    right  = mid2-1;
                }
            }
            System.out.println("NO");
        }
    }
}
