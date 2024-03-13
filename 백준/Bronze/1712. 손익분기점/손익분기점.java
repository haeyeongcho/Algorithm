import java.io.*;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        long a = Long.parseLong(input[0]);
        long b = Integer.parseInt(input[1]);
        long c = Integer.parseInt(input[2]);

        long cost = a;
        long sales = 0;
        long num = 0;

        while (true) {
            if (b >= c) {
                num = -1;
                break;
            }
            cost += b;
            sales += c;
            num++;

            if (cost < sales) {
                break;
            }
        }

        bw.write(Long.toString(num));

        bw.flush();
        bw.close();
        br.close();
    }
}