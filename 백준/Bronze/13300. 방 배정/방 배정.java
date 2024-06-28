import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int K = Integer.parseInt(inputs[1]);

        int[] maleCount = new int[6];
        int[] femaleCount = new int[6];

        for (int i = 0; i < N; i++) {
            String[] student = br.readLine().split(" ");
            int S = Integer.parseInt(student[0]);
            int Y = Integer.parseInt(student[1]);
            if (S == 0) {
                femaleCount[Y - 1]++;
            } else {
                maleCount[Y - 1]++;
            }
        }

        int room = 0;

        for (int i = 0; i < 6; i++) {
            if (femaleCount[i] >= 1) {
                room += (femaleCount[i] + K - 1) / K;
            }
            if (maleCount[i] >= 1) {
                room += (maleCount[i] + K - 1) / K;
            }
        }

        bw.write(room + "");

        bw.flush();
        bw.close();
        br.close();
    }
}