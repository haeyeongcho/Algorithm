import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        BigInteger fac = new BigInteger("1");
        int count = 0;
        for (int i = 1; i <= num; i++) {
            fac = fac.multiply(new BigInteger(String.valueOf(i)));
        }
        String fac_str = fac.toString();
        for (int i = 0; i < fac_str.length(); i++) {
            if (fac_str.charAt(fac_str.length() - 1 - i) == '0') {
                count++;
            } else {
                break;
            }
        }
        bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
        br.close();
    }
}