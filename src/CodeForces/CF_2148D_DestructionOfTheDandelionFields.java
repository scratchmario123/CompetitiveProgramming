package CodeForces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CF_2148D_DestructionOfTheDandelionFields {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            List<Long> li = new ArrayList<>();
            long evens = 0;
            for (int j = 0; j < n; j++) {
                long a = sc.nextLong();
                if (a%2==0) evens+=a;
                else li.add(a);
            }
            sc.nextLine();
            Collections.sort(li);
            Collections.reverse(li);
            long ans = 0;
            for (int j = 0; j < (int)Math.ceil(li.size() / 2.0); j++) {
                ans += li.get(j);
            }
            System.out.println(ans == 0 ? ans : ans+evens);
        }
    }
}
