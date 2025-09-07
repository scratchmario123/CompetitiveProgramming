package AtCoder.ABC.ABC_422;

import java.util.Scanner;

public class ABC_422B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), w = sc.nextInt(); sc.nextLine();
        char[][] arr = new char[h][w];
        for (int i = 0; i < h; i++) {
            arr[i] = sc.nextLine().toCharArray();
        }
        boolean found = false;
        big:
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (arr[i][j] == '#') {
                    int cnt = 0;
                    if (i != 0) if (arr[i-1][j] == '#') cnt++;
                    if (i != h-1) if (arr[i+1][j] == '#') cnt++;
                    if (j != 0) if (arr[i][j-1] == '#') cnt++;
                    if (j != w-1) if (arr[i][j+1] == '#') cnt++;
                    if (cnt== 0 || cnt%2!=0) {
                        System.out.println("No");
                        found = true;
                        break big;
                    }
                }
            }
        }
        if (!found) System.out.println("Yes");
    }
}
