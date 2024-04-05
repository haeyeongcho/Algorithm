import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input1 = br.readLine().split(" ");
        String[] input2 = br.readLine().split(" ");

        int a = Integer.parseInt(input1[0]) * Integer.parseInt(input2[1])
                + Integer.parseInt(input2[0]) * Integer.parseInt(input1[1]);
        int b = Integer.parseInt(input1[1]) * Integer.parseInt(input2[1]);

        int x = Math.max(a, b);
        int y = Math.min(a, b);

        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        a /= x;
        b /= x;

        bw.write(a + " " + b);

        bw.flush();
        bw.close();
        br.close();
    }
}