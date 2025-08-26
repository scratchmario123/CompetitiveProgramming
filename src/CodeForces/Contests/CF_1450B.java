package CodeForces.Contests;

import java.awt.*;
import java.util.*;
import java.util.List;

public class CF_1450B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); int k  = sc.nextInt();
            List<Point> pts = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                pts.add(new Point(sc.nextInt(),sc.nextInt()));
                sc.nextLine();
            }
            int[] absorbed = new int[n];
            for (int l = 0; l < pts.size(); l++) {
                for (Point pt : pts) {
                    if (Math.abs(pts.get(l).x - pt.x) + Math.abs(pts.get(l).y - pt.y) <= k) {
                        absorbed[l]++;
                    }
                }
            }
            boolean found = false;
            for (int amount : absorbed) {
                if (amount == n) {
                    found = true;
                    break;
                }
            }
            System.out.println(found ? 1 : -1);
        }
    }
}
