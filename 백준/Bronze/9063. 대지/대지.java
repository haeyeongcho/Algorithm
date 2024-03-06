import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] x_arr = new int[N];
        int[] y_arr = new int[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x_arr[i] = Integer.parseInt(st.nextToken());
            y_arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(x_arr);
        Arrays.sort(y_arr);

        int result = (x_arr[x_arr.length - 1] - x_arr[0]) * (y_arr[y_arr.length - 1] - y_arr[0]);

        bw.write(Integer.toString(result));

        bw.flush();
        bw.close();
        br.close();
    }
}