import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input1 = br.readLine().split(" ");
        String[] input2 = br.readLine().split(" ");

        int A = Integer.parseInt(input1[0]);
        int B = Integer.parseInt(input1[1]);
        int C = Integer.parseInt(input2[0]);
        int D = Integer.parseInt(input2[1]);

        int min = A + D <= B + C ? (A + D) : (B + C);
        
        bw.write(min + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
