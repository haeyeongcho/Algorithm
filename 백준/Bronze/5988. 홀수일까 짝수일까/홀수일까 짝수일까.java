import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            bw.write(oddOrEven(new BigInteger(br.readLine())));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static String oddOrEven(BigInteger n) {
        if (n.mod(new BigInteger(String.valueOf(2))).equals(new BigInteger(String.valueOf(0)))) {
            return "even";
        } else {
            return "odd";
        }
    }
}