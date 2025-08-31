package CodeForces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CF_2133B_Villagers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); sc.nextLine();
            List<Long> arr = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                arr.add(sc.nextLong());
            }
            Collections.sort(arr);
            Collections.reverse(arr);

            long sum = 0;
            for (int j = 0; j < n; j+=2) {
                sum += arr.get(j);
            }

            System.out.println(sum);

            sc.nextLine();
        }
    }
}
