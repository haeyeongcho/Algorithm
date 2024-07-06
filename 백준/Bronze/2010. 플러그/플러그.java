import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < N; i++) {
            int multitap = Integer.parseInt(br.readLine());
            result += multitap;
            result -= 1;
        }
        result += 1;

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}