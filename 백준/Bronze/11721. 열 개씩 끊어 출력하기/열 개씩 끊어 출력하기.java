import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        for (int i = 1; i < input.length()+1; i++) {
            bw.write(input.charAt(i-1));
            if (i % 10 == 0 && i != 0) {
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}