import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[][] big = new int[N][2];

        String[] str;
        for (int i = 0; i < N; i++) {
            str = br.readLine().split(" ");
            big[i][0] = Integer.parseInt(str[0]);
            big[i][1] = Integer.parseInt(str[1]);
        }

        for (int i = 0; i < N; i++) {

            int rank = 1;

            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                }

                if (big[i][0] < big[j][0] && big[i][1] < big[j][1]) {
                    rank++;
                }
            }
            bw.write(Integer.toString(rank)+" ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}