import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int result1 = 0;
        for (int i = 0; i < 4; i++) {
            result1 += Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int result2 = 0;
        for (int i = 0; i < 4; i++) {
            result2 += Integer.parseInt(st.nextToken());
        }

        if (result1 > result2) {
            bw.write(result1 + "\n");
        } else {
            bw.write(result2 + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}