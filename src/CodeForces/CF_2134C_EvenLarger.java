package CodeForces;

import java.util.Scanner;

public class CF_2134C_EvenLarger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); sc.nextLine();
            long[] arr = new long[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextLong();
            }

            long cnt = 0;
            for (int j = 0; j < n; j+=2) {
                if (j != 0 && arr[j-1] < arr[j]) {
                    cnt += arr[j]-arr[j-1];
                    arr[j] = arr[j-1];
                }
                if (j != n-1 && arr[j+1] < arr[j]) {
                    cnt += arr[j]-arr[j+1];
                    arr[j] = arr[j+1];
                }
            }
            for (int j = 0; j < n-2; j+=2) {
                long oddSum = arr[j] + arr[j+2];
                long diff = oddSum - arr[j+1];
                if (diff > 0) {
                    cnt += diff;
                    if (diff > arr[j+2]) {
                        diff -= arr[j+2];
                        arr[j+2] = 0;
                        arr[j] -= diff;
                    } else {
                        arr[j+2] -= diff;
                    }
                }

            }
            System.out.println(cnt);

            sc.nextLine();
        }
    }
}
