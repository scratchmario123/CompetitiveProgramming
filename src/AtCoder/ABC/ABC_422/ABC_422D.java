package AtCoder.ABC.ABC_422;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ABC_422D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List<Integer> last  = new ArrayList<>(List.of(k));
        for (int i = 0; i < n; i++) {
            List<Integer> temp  =new ArrayList<>();
            for (int num : last) {
                temp.add(num/2); temp.add(num-num/2);
            }
            last = temp;
        }
        if (k%(Math.pow(2,n))==0) System.out.println(0);
        else System.out.println(1);

        PrintWriter out  = new PrintWriter(System.out);


        for (int i = 0; i < last.size(); i++) {
            if (i != 0) out.print(" ");
            out.print(last.get(i));
        }

        out.flush();

    }
}
