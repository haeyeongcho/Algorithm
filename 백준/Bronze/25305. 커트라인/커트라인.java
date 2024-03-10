import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] scores = new int[N];

        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(scores);

        bw.write(Integer.toString(scores[scores.length - k]));

        bw.flush();
        bw.close();
        br.close();
    }
}