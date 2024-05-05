import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        ArrayList<Integer> arrayList = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arrayList.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            arrayList.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(arrayList);

        for (Integer i : arrayList) {
            bw.write(i + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}