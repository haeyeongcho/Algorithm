import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        double a = Double.parseDouble(input[0]);
        double b = Double.parseDouble(input[1]);
        double c = Double.parseDouble(input[2]);

        int result1 = (int) (a / b * c);
        int result2 = (int) (a * b / c);

        int maxResult = Math.max(result1, result2);

        bw.write(maxResult + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}