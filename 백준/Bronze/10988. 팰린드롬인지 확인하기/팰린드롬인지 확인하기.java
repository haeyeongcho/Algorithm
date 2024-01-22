import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        char[] chars = input.toCharArray();
        int flag = 1;

        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - i - 1]) {
                flag = 0;
                break;
            }
        }
        bw.write(Integer.toString(flag));
        bw.flush();
        bw.close();
        br.close();
    }
}