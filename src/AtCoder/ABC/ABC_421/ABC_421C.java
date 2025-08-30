package AtCoder.ABC.ABC_421;

import java.util.Scanner;

public class ABC_421C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        String s = sc.nextLine();
        int aLoc = 0;
        long aSwaps = 0;
        int bLoc = 0;
        long bSwaps = 0;
        //swap b's
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'B') {
                bSwaps += Math.abs(i-bLoc);
                bLoc +=2;
            }
        }
        //swap a's
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'A') {
                aSwaps += Math.abs(i-aLoc);
                aLoc += 2;
            }
        }
        System.out.println(Math.min(aSwaps,bSwaps));
    }
}
