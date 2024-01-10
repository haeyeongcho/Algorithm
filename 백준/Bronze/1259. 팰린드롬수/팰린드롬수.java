import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = "";
        while (true) {
            int flag = 1;
            s = br.readLine();
            if (s.equals("0"))
                break;
            char[] ch = s.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] != ch[ch.length - i - 1]) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                bw.write("yes");
            } else {
                bw.write("no");
            }
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }
}