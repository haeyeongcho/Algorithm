import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int test_num = Integer.parseInt(br.readLine());
        for (int i = 0; i < test_num; i++) {
            int K = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());
            int num[] = new int[N];
            int num2[] = new int[N];
            for (int t = 0; t < N; t++) {
                num[t] = t+1;
            }
            for (int j = 0; j < K; j++) {
                for (int k = 0; k < N; k++) {
                    int sum = 0;
                    for (int z = 0; z <= k; z++) {
                        sum += num[z];
                    }
                    num2[k] = sum;
                }
                for (int z = 0; z < num.length; z++) {
                    num[z] = num2[z];
                }
            }
            bw.write(String.valueOf(num[N-1]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}