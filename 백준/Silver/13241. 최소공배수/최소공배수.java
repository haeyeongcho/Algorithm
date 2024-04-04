import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        long x = Long.parseLong(input[0]);
        long y = Long.parseLong(input[1]);

        long a;
        long b;

        if (x > y) {
            a = x;
            b = y;
        } else {
            b = x;
            a = y;
        }
        
        System.out.println(a*b/gcd(a, b));
        
    }

    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}