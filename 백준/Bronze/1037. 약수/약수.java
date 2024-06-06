import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] measure = new int[input.length];

        for (int i = 0; i < N; i++) {
            measure[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(measure);

        int result = measure[0] * measure[measure.length - 1];

        bw.write(result + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}