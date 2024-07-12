import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
       
        if (input.length() >= 2 && input.charAt(0) == '"' && input.charAt(input.length() - 1) == '"') {
            String innerString = input.substring(1, input.length() - 1);
            if (innerString.length() > 0) {
                bw.write(innerString);
            } else {
                bw.write("CE");
            }
        } else {
            bw.write("CE");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
