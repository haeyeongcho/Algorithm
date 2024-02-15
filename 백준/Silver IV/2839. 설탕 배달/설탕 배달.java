import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int result = 0;
        int count_3 = 0;
        int count_5 = 0;

        while (true) {
            if (n < 0) {
                break;
            }
            if (n % 3 == 0) {
                count_3 = n / 3;
                result = count_3 + count_5;
            }
            n = n - 5;
            count_5++;
        }

        if (result > 0) {
            bw.write(Integer.toString(result));
        } else {
            bw.write("-1");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}