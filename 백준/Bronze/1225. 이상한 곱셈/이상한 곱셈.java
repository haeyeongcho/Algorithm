import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");

        String A = inputs[0];
        String B = inputs[1];
        long result = 0;

        for (int i = 0; i < A.length(); i++) {
            for (int j = 0; j < B.length(); j++) {
                result += Integer.parseInt(String.valueOf(A.charAt(i))) *
                        Integer.parseInt(String.valueOf(B.charAt(j)));
            }
        }

        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }
}