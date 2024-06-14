import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] inputs = br.readLine().split(" ");

            double n = Double.parseDouble(inputs[0]);
            for (int j = 1; j < inputs.length; j++) {
                if (inputs[j].equals("@")) {
                    n *= 3;
                } else if (inputs[j].equals("%")) {
                    n+=5;
                } else if (inputs[j].equals("#")) {
                    n -= 7;
                }
            }
            bw.write(String.format("%.2f", n) + "\n");

        }


        bw.flush();
        bw.close();
        br.close();
    }
}