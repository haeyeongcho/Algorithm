import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N];

        for (int i = 0; i < basket.length; i++) {
            basket[i] = i + 1;
        }

        int temp = 0;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());
            for (int j = 0; j < (J - I + 1) / 2; j++) {
                temp = basket[I + j - 1];
                basket[I + j - 1] = basket[J - j - 1];
                basket[J - j - 1] = temp;
            }
        }

        for (int j : basket) {
            bw.write(j + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}