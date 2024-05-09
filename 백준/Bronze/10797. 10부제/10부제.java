import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int day = Integer.parseInt(br.readLine());
        int[] num = new int[5];
        int result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(st.nextToken());
            if (num[i] == day) {
                result++;
            }
        }

        bw.write(result + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}