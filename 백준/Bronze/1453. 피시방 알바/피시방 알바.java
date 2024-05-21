import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        boolean[] seat = new boolean[100];
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int idx = Integer.parseInt(st.nextToken());
            if (seat[idx - 1] == false) {
                seat[idx - 1] = true;
            } else if (seat[idx - 1] == true) {
                count++;
            }
        }

        bw.write(count+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}