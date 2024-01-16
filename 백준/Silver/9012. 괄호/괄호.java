import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        String[] parenthesisString = new String[T];

        for (int i = 0; i < T; i++) {
            parenthesisString[i] = br.readLine();
        }

        int count = 0;

        for (int i = 0; i < T; i++) {
            for (int j = 0; j < parenthesisString[i].length(); j++) {
                if (parenthesisString[i].charAt(j) == '(') {
                    count++;
                } else if (parenthesisString[i].charAt(j) == ')') {
                    count--;
                    if (count < 0) {
                        break;
                    }
                }
            }
            if (count == 0) {
                bw.write("YES");
                bw.newLine();
            } else {
                bw.write("NO");
                bw.newLine();
            }
            count = 0;
        }
        bw.flush();
        bw.close();
        br.close();
    }
}