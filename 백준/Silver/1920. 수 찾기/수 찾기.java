import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] N_arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            N_arr[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] M_arr = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            M_arr[i] = Integer.parseInt(st.nextToken());
        }

        int flag = 0;

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (M_arr[i] == N_arr[j]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                bw.write(Integer.toString(1));
                bw.newLine();
            } else {
                bw.write(Integer.toString(0));
                bw.newLine();
            }
            flag = 0;
        }

        bw.flush();
        bw.close();
        br.close();
    }
}