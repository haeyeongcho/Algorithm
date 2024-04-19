import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int test_case = Integer.parseInt(br.readLine());

        for (int i = 0; i < test_case; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            double sum = 0;
            int num = Integer.parseInt(st.nextToken());
            int[] scores = new int[num];
            for (int j = 0; j < num; j++) {
                scores[j] = Integer.parseInt(st.nextToken());
                sum += scores[j];
            }
            
            double result = sum / num;

            double count = 0;
            for (int j = 0; j < num; j++) {
                if (scores[j] > result) {
                    count++;
                }
            }

            result = count / num * 100;

            bw.write(String.format("%.3f%%\n", result));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}