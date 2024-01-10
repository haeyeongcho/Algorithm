import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int gcd = 1;
        int min = Math.min(num1, num2);
        for (int i = 2; i <= min; i++) {
            while(num1 % i == 0 && num2 % i == 0) {
                gcd *= i;
                num1 /= i;
                num2 /= i;
            }
        }
        int lcm = num1 * num2 * gcd;

        bw.write(Integer.toString(gcd));
        bw.newLine();
        bw.write(Integer.toString(lcm));

        bw.flush();
        bw.close();
        br.close();
    }
}