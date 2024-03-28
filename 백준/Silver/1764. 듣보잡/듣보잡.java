import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
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

        ArrayList<String> nameList_b = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            String temp = br.readLine();
            if (nameList_a.contains(temp)) {
                nameList_b.add(temp);
            }
        }

        Collections.sort(nameList_b);

        bw.write(nameList_b.size() + "\n");

        for (String s : nameList_b) {
            bw.write(s + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}