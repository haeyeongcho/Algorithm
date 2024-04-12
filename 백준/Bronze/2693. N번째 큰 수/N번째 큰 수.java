import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int test = Integer.parseInt(br.readLine());


        for (int i = 0; i < test; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int j = 0; j < 10; j++) {
                arrayList.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(arrayList);
            bw.write(arrayList.get(arrayList.size() - 3) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}