import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String searchStr = "DKSH";
        int count =0;
        int fromIndex =0;

        while ((fromIndex = str.indexOf(searchStr, fromIndex)) != -1) {
            count++;
            fromIndex += searchStr.length();
        }

        bw.write(count + "");

        bw.flush();
        bw.close();
        br.close();
    }
}