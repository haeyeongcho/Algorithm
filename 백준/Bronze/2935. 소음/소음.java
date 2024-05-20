import java.io.*;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger a = new BigInteger(br.readLine());
        String input = br.readLine();
        BigInteger b = new BigInteger(br.readLine());

        if (input.equals("+")) {
            bw.write((a.add(b) + "\n"));
        } else if (input.equals("*")) {
            bw.write(a.multiply(b) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}