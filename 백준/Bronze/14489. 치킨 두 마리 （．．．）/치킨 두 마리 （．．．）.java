import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] inputs = br.readLine().split(" ");
        int chicken = Integer.parseInt(br.readLine());

        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);

        if (a + b - chicken * 2 < 0) {
            bw.write(a + b + "");
        } else {
            bw.write(a + b - chicken * 2 + "");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}