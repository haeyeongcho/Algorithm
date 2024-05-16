import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int yes = 0;
        int no = 0;
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            if (input.equals("1")) {
                yes++;
            } else if (input.equals("0")) {
                no++;
            }
        }

        boolean result = (yes > no) ? true : false;
        if (result == true) {
            bw.write("Junhee is cute!");
        } else {
            bw.write("Junhee is not cute!");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}