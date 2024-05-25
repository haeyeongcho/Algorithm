import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            if (br.readLine().contains("FBI")) {
                sb.append((i+1)+" ");
            }

        }

        if (sb.length() == 0) {
            bw.write("HE GOT AWAY!\n");
        } else {
            bw.write(sb+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}