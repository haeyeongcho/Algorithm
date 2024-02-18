import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int numberOfApocalypse = 666;

        while (true) {
            String str = Integer.toString(numberOfApocalypse);

            for (int i = str.length() - 1; i > 1; i--) {
                if (str.charAt(i) == '6' && str.charAt(i - 1) == '6' && str.charAt(i - 2) == '6') {
                    count++;
                    break;
                }
            }

            if (N == count) {
                bw.write(Integer.toString(numberOfApocalypse));
                break;
            }

            numberOfApocalypse++;
        }

        bw.flush();
        bw.close();
        br.close();

    }
}