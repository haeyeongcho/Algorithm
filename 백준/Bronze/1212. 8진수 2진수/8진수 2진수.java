import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '0') {
                sb.append("000");
            } else if (input.charAt(i) == '1') {
                sb.append("001");
            }else if (input.charAt(i) == '2') {
                sb.append("010");
            }else if (input.charAt(i) == '3') {
                sb.append("011");
            }else if (input.charAt(i) == '4') {
                sb.append("100");
            }else if (input.charAt(i) == '5') {
                sb.append("101");
            }else if (input.charAt(i) == '6') {
                sb.append("110");
            }else if (input.charAt(i) == '7') {
                sb.append("111");
            }
        }

        if (sb.charAt(0) == '0') {
            if (sb.charAt(1) == '0') {
                sb.delete(0, 2);
            } else {
                sb.delete(0, 1);
            }
        }

        bw.write(sb + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}