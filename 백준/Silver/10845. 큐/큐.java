import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            if (str.equals("push")) {
                int num = Integer.parseInt(st.nextToken());
                list.add(num);
            } else if (str.equals("pop")) {
                if (list.isEmpty()) {
                    bw.write(Integer.toString(-1));
                    bw.newLine();
                } else {
                    int n = list.remove(0);
                    bw.write(Integer.toString(n));
                    bw.newLine();
                }
            } else if (str.equals("size")) {
                bw.write(Integer.toString(list.size()));
                bw.newLine();
            } else if (str.equals("empty")) {
                if (list.isEmpty()) {
                    bw.write(Integer.toString(1));
                    bw.newLine();
                } else {
                    bw.write(Integer.toString(0));
                    bw.newLine();
                }
            } else if (str.equals("front")) {
                if (list.isEmpty()) {
                    bw.write(Integer.toString(-1));
                    bw.newLine();
                } else {
                    bw.write(Integer.toString(list.get(0)));
                    bw.newLine();
                }
            } else if (str.equals("back")) {
                if (list.isEmpty()) {
                    bw.write(Integer.toString(-1));
                    bw.newLine();
                } else {
                    bw.write(Integer.toString(list.get(list.size() - 1)));
                    bw.newLine();
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}