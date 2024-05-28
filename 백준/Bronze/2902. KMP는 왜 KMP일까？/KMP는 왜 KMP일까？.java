import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringBuilder sb = new StringBuilder();
        sb.append(input.charAt(0));

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i)=='-') {
                sb.append(input.charAt(i + 1));
            }
        }

        bw.write(sb + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}