import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder(br.readLine());

        while (sb.length() > 1) {
            int len = sb.length();
            char A0 = sb.charAt(len - 2);
            char A1 = sb.charAt(len - 1);

            if (A0 == A1) {
                sb.deleteCharAt(len - 1);
            } else if (A0 == 'A') {
                if (A1 == 'G') {
                    sb.delete(len - 2, len);
                    sb.append('C');
                } else if (A1 == 'C') {
                    sb.delete(len - 2, len);
                    sb.append('A');
                } else if (A1 == 'T') {
                    sb.delete(len - 2, len);
                    sb.append('G');
                }
            } else if (A0 == 'G') {
                if (A1 == 'A') {
                    sb.delete(len - 2, len);
                    sb.append('C');
                } else if (A1 == 'C') {
                    sb.delete(len - 2, len);
                    sb.append('T');
                } else if (A1 == 'T') {
                    sb.delete(len - 2, len);
                    sb.append('A');
                }
            } else if (A0 == 'C') {
                if (A1 == 'A') {
                    sb.delete(len - 2, len);
                    sb.append('A');
                } else if (A1 == 'G') {
                    sb.delete(len - 2, len);
                    sb.append('T');
                } else if (A1 == 'T') {
                    sb.delete(len - 2, len);
                    sb.append('G');
                }
            } else if (A0 == 'T') {
                if (A1 == 'A') {
                    sb.delete(len - 2, len);
                    sb.append('G');
                } else if (A1 == 'G') {
                    sb.delete(len - 2, len);
                    sb.append('A');
                } else if (A1 == 'C') {
                    sb.delete(len - 2, len);
                    sb.append('G');
                }
            }
        }

        bw.write(sb.toString() + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}