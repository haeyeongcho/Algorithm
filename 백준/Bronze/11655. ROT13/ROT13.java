import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ('0' <= ch && ch <= '9' || ch == ' ') {
                sb.append(ch);
            } else if (ch >= 'a' && ch <= 'z') {
                sb.append((char) ((ch - 'a' + 13) % 26 + 'a'));
            } else if (ch >= 'A' && ch <= 'Z') {
                sb.append((char) ((ch + -'A' + 13) % 26 + 'A'));
            }
        }
        bw.write(sb.toString() + "");

        bw.flush();
        bw.close();
        br.close();
    }
}