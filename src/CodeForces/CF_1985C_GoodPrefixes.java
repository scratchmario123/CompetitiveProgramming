package CodeForces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CF_1985C_GoodPrefixes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); sc.nextLine();

            Set<Long> numbers = new HashSet<>();
            long sum = 0;
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                long num = sc.nextLong();
                sum += num;
                numbers.add(num);
                if (sum%2 == 0 && numbers.contains(sum/2)) cnt++;
            }
            sc.nextLine();
            System.out.println(cnt);
        }
    }
}
