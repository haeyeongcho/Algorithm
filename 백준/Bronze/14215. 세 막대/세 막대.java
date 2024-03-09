import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        boolean flag;

        while (true) {
            flag = true;

            if (!(a + b > c)) {
                c--;
                flag = false;
            }
            if (!(a + c > b)) {
                b--;
                flag = false;
            }
            if (!(b + c > a)) {
                a--;
                flag = false;
            }

            if (flag == true) {
                break;
            }
        }

        bw.write(Integer.toString(a + b + c));

        bw.flush();
        bw.close();
        br.close();
    }
}