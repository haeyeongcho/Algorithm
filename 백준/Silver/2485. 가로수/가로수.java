import java.io.*;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[] tree = new int[num];

        for (int i = 0; i < num; i++) {
            tree[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(tree);

        int gcd = 0;
        for (int i = 0; i < num - 1; i++) {
            int distance = tree[i+1]-tree[i];
            gcd = GCD(distance, gcd);
        }

        bw.write((tree[num - 1] - tree[0]) / gcd + 1 - (tree.length)+"\n");

        bw.flush();
        bw.close();
        br.close();
    }

    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return GCD(b, a % b);
        }
    }
}