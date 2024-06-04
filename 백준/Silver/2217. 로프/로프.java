import java.io.*;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] rope = new int[N];
        int[] max_weight = new int[N];

        for (int i = 0; i < N; i++) {
            rope[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(rope);

        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                max_weight[i] += rope[i];
            }
        }

        Arrays.sort(max_weight);

        bw.write(max_weight[max_weight.length - 1] +"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}