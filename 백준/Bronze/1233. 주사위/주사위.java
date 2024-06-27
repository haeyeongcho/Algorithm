import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int s1 = Integer.parseInt(inputs[0]);
        int s2 = Integer.parseInt(inputs[1]);
        int s3 = Integer.parseInt(inputs[2]);
        
        int[] haps = new int[s1 + s2 + s3 + 1];

        for (int i = 1; i <= s1; i++) {
            for (int j = 1; j <= s2; j++) {
                for (int k = 1; k <= s3; k++) {
                    haps[i + j + k]++;
                }
            }
        }

        int index = 0;

        for (int i = 0; i < haps.length - 1; i++) {
            if (haps[i] < haps[i + 1]) {
                index = i+1;
            }
        }
        bw.write(index + "");

        bw.flush();
        bw.close();
        br.close();
    }
}