import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] alphabet = new int[26];
        String input = br.readLine();

        for (int i = 0; i < input.length(); i++) {
            alphabet[(int)(input.charAt(i)) -97]++;
        }

        for (int i : alphabet) {
            bw.write(Integer.toString(i)+" ");
        }


        bw.flush();
        bw.close();
        br.close();
    }
}