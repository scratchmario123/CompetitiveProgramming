package CodeForces;

import java.io.PrintWriter;
import java.util.*;

public class CF_1864B_SwapAndReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out  = new PrintWriter(System.out);
        int t = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt(); sc.nextLine();
            char[] c = sc.nextLine().toCharArray();


            if (k%2 == 0) {
                Arrays.sort(c);
                for (char cc : c) {
                    out.print(cc);
                }
                out.println();
            } else {
                char[] even = new char[n/2+n%2];
                char[] odd = new char[n/2];
                int e = 0, o = 0;
                for (int j = 0; j < n; j++) {
                    if (j%2 == 0) {
                        even[e] = c[j];
                        e++;
                    } else {
                        odd[o] = c[j];
                        o++;
                    }
                }
                Arrays.sort(even);
                Arrays.sort(odd);
                e = 0; o = 0;
                for (int j = 0; j < n; j++) {
                    if (j%2 == 0) {
                        out.print(even[e]);
                        e++;
                    } else {
                        out.print(odd[o]);
                        o++;
                    }
                }
                out.println();
            }
            out.flush();
        }
    }
}
