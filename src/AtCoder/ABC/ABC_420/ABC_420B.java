package AtCoder.ABC.ABC_420;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABC_420B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        List<String> ppl = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ppl.add(sc.nextLine());
        }

        int[] scores = new int[m];

        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if (String.valueOf(ppl.get(j).charAt(i)).equals("1")) sum++;
            }
            if (sum == 0 || sum == n) {
                scores[i] = 2;
            } else if (sum < (int)(Math.ceil(n/2.0))) {
                scores[i] = 1;
            }
        }

        int max = 0;
        int[] totalScores = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                String cur = String.valueOf(ppl.get(i).charAt(j));
                if (scores[j] == 2 || Integer.parseInt(cur) == scores[j]) {
                    totalScores[i]++;
                }
            }
            if (totalScores[i]>max) max=totalScores[i];
        }

        boolean first = false;
        for (int i = 0; i < n; i++) {
            if (totalScores[i] == max) {
                if (first) System.out.print(" ");
                if (!first) first = true;
                System.out.print(i+1);
            }
        }
    }
}
