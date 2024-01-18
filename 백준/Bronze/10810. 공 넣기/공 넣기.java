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
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int last = Integer.parseInt(st.nextToken());
            int ballNum = Integer.parseInt(st.nextToken());
            for (int j = first - 1; j < last; j++) {
                basket[j] = ballNum;
            }
        }
        for (int i = 0; i < basket.length; i++) {
            bw.write(basket[i] + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}