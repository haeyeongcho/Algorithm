import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String[] inputs = new String[N];

        for (int i = 0; i < N; i++) {
            inputs[i] = br.readLine();
        }

        StringBuilder sb = new StringBuilder();
        boolean flag = true;

        for (int i = 0; i < inputs[0].length(); i++) {
            flag = true;
            for (int j = 1; j < N; j++) {
                if (inputs[0].charAt(i) != inputs[j].charAt(i)) {
                    sb.append("?");
                    flag = false;
                    break;
                }
            }
            if (flag) {
                sb.append(inputs[0].charAt(i) + "");
            }
        }

        bw.write(sb + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}