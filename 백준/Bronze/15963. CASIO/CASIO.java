import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        long N = Long.parseLong(inputs[0]);
        long M = Long.parseLong(inputs[1]);
        if (N == M) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}