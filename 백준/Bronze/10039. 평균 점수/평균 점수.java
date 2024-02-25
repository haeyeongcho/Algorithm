import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result = 0;

        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num < 40) {
                result += 40;
            } else {
                result += num;
            }
        }

        bw.write(Integer.toString(result / 5));

        bw.flush();
        bw.close();
        br.close();
    }
}