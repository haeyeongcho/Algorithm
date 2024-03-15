import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int d = Integer.parseInt(input[3]);
        int e = Integer.parseInt(input[4]);
        int f = Integer.parseInt(input[5]);

        bw.write((c * e - b * f) / (a * e - b * d) + " "); //x축
        bw.write((c * d - a * f) / (b * d - a * e) + ""); // y축

        bw.flush();
        bw.close();
        br.close();
    }
}