import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int input = Integer.parseInt(br.readLine());
        String[] words = new String[input];
        String temp = "";
        for (int i = 0; i < words.length; i++) {
            words[i] = br.readLine();
        }
        Arrays.sort(words);

        for (int j = 0; j < words.length; j++) {
            for (int i = 0; i < words.length - 1; i++) {
                if (words[i].length() > words[i + 1].length()) {
                    temp = words[i + 1];
                    words[i + 1] = words[i];
                    words[i] = temp;
                }
            }
        }
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].equals(words[i + 1])) {
                words[i] = "";
                continue;
            }
            bw.write(words[i]);
            bw.newLine();
        }
        bw.write(words[words.length - 1]);

        bw.flush();
        bw.close();
        br.close();
    }
}