package CodeForces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CF_1859B_OlyaAndGameWithArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); sc.nextLine();
            List<Integer> minEle = new ArrayList<>();
            List<Integer> sMinEle = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                int m = sc.nextInt(); sc.nextLine();
                int min = Integer.MAX_VALUE,sMin = Integer.MAX_VALUE;

                for (int k = 0; k < m; k++) {
                    int num = sc.nextInt();
                    if (num < min) {
                        sMin = min;
                        min = num;
                    }
                    else if (num < sMin) {
                        sMin = num;
                    }
                }
                minEle.add(min);
                sMinEle.add(sMin);
                sc.nextLine();
            }
            long sum = 0;
            int min = Integer.MAX_VALUE;
            for (int value : minEle) {
                if (value < min) min = value;
            }
            int sMin = Integer.MAX_VALUE;
            for (int value : sMinEle) {
                if (value < sMin) sMin = value;
                sum += value;
            }
            System.out.println(sum+min-sMin);
        }
    }
}
