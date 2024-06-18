import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int X = Integer.parseInt(inputs[0]);
        int Y = Integer.parseInt(inputs[1]);
        int P1 = Integer.parseInt(inputs[2]);
        int P2 = Integer.parseInt(inputs[3]);
        
        int maxSteps = 10000;
        boolean found = false;

        for (int i = 0; i < maxSteps; i++) {
            for (int j = 0; j < maxSteps; j++) {
                if (P1 + i * X == P2 + j * Y) {
                    bw.write((P1 + i * X) + "\n");
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (!found) {
            bw.write("-1\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}