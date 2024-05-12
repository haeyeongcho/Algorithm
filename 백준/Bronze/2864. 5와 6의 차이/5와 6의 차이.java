import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int a1 = Integer.parseInt(input[0].replace('6', '5'));
        int b1 = Integer.parseInt(input[1].replace('6', '5'));

        int a2 = Integer.parseInt(input[0].replace('5', '6'));
        int b2 = Integer.parseInt(input[1].replace('5', '6'));

        bw.write((a1 + b1) + " " + (a2 + b2));

        bw.flush();
        bw.close();
        br.close();
    }
}