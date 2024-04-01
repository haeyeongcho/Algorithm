import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);


        HashSet<Integer> a_set = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            a_set.add(Integer.parseInt(st.nextToken()));
        }

        int count = a;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) {
            String temp = st.nextToken();
            if (a_set.contains(Integer.parseInt(temp))) {
                count--;
            } else {
                count++;
            }
        }

        bw.write(count + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}