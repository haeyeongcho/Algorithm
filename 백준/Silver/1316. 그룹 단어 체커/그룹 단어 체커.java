import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] words = new String[N];
        int result = 0;
        int flag = 0;

        for (int i = 0; i < N; i++) {
            words[i] = br.readLine();
        }

        for (int i = 0; i < N; i++) {
            char[] chars = words[i].toCharArray();
            if (chars.length <= 2) {
                result++;
                continue;
            }
            for (int j = 0; j < chars.length - 2; j++) {
                if (chars[j] != chars[j + 1]) {
                    for (int k = j + 2; k < chars.length; k++) {
                        if (chars[j] == chars[k]) {
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 1) break;
                }
            }
            if (flag == 0) result++;
            flag = 0;
        }
        bw.write(Integer.toString(result));

        bw.flush();
        bw.close();
        br.close();
    }
}