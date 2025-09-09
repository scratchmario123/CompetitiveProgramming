package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class CF_2137D_ReplaceWithOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); sc.nextLine();
            int[] arr = new int[n];
            int[] cnt = new int[n+1];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
                cnt[arr[j]]++;
            }
            sc.nextLine();
            StringBuilder ans = new StringBuilder();
            boolean done = false;

            int[] copy = Arrays.copyOf(cnt,n+1);
            int curNum = 1;
            int[] cnTrack = new int[n+1];
            cnTrack[arr[0]] = curNum;
            for (int j = 0; j < n; j++) {
                if (copy[j+1] != 0 && copy[j+1]%(j+1) != 0) {
                    System.out.println(-1);
                    done = true;
                    break;
                } else {
                    if (cnTrack[arr[j]] == 0) {
                        curNum++;
                        cnTrack[arr[j]] = curNum;
                    }
                    ans.append(cnTrack[arr[j]]).append(" ");
                    cnt[arr[j]]--;
                    if (cnt[arr[j]] != 0 && cnt[arr[j]]%arr[j] == 0) {
                        curNum++;
                        cnTrack[arr[j]] = curNum;
                    }
                }
            }
            if (!done) {
                System.out.println(ans);
            }
        }
    }
}
