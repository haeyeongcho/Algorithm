import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        double D = Double.parseDouble(input[0]);
        double H = Double.parseDouble(input[1]);
        double W = Double.parseDouble(input[2]);

        double pow = Math.pow(D, 2) / (Math.pow(H, 2) + Math.pow(W, 2));
        double sqrt = Math.sqrt(pow);

        bw.write((int) (sqrt * H) + " " + (int) (sqrt * W) + "");

        bw.flush();
        bw.close();
        br.close();
    }
}