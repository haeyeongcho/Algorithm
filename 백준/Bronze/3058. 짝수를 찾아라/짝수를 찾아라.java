import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] test_data = new int[7];
            int sum = 0;
            int min = 0;

            for (int j = 0; j < test_data.length; j++) {
                test_data[j] = Integer.parseInt(st.nextToken());
                if (test_data[j] % 2 == 0) {
                    sum += test_data[j];
                }
            }

            Arrays.sort(test_data);

            for (int j = 0; j < test_data.length; j++) {
                if (test_data[j] % 2 == 0) {
                    min = test_data[j];
                    break;
                }
            }

            bw.write(sum +" "+min);
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}