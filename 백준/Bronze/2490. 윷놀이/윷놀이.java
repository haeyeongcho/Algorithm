import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 3; i++) {
            String[] input = br.readLine().split(" ");
            int result = 0;
            for (int j = 0; j < input.length; j++) {
                if (input[j].equals("1")) result++;
            }
            if (result == 0) {
                bw.write("D");
            } else if (result == 1) {
                bw.write(("C"));
            }else if (result == 2) {
                bw.write(("B"));
            }else if (result == 3) {
                bw.write(("A"));
            }else if (result == 4) {
                bw.write(("E"));
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}