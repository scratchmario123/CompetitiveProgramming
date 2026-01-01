package CodeForces;

import java.util.*;

public class CF_2131C_MakeItEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); int k = sc.nextInt(); sc.nextLine();
            int[] arr1 = new int[n];
            int[] arr2 = new int[n];
            for (int j= 0; j < n; j++) {
                arr1[j] = sc.nextInt();
            } sc.nextLine();
            for (int j = 0; j < n; j++) {
                arr2[j] = sc.nextInt();
            }sc.nextLine();
            for (int j = 0; j < n; j++) {
                arr1[j] = arr1[j]%k < Math.abs(arr1[j]%k-k) ?  arr1[j]%k : Math.abs(arr1[j]%k-k);
                arr2[j] = arr2[j]%k < Math.abs(arr2[j]%k-k) ?  arr2[j]%k : Math.abs(arr2[j]%k-k);
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            boolean broke = false;
            for (int j = 0; j < n; j++) {
                if (arr1[j] != arr2[j]) {
                    System.out.println("NO");
                    broke = true;
                    break;
                }
            }
            if (!broke) System.out.println("YES");
        }
    }
}
