import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        HashSet<String> nameList_a = new HashSet<>();
        for (int i = 0; i < N; i++) {
            nameList_a.add(br.readLine());
        }

        int result = 0;

        for (int i = 0; i < M; i++) {
            String temp = br.readLine();
            if (nameList_a.contains(temp)) {
                result++;
            }
        }
        
        bw.write(result + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}