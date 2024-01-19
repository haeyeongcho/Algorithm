import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num != 0) {
                list.add(num);
            } else if (num == 0) {
                list.remove(list.size() - 1);
            }
        }
        if (list.isEmpty()) {
            bw.write(Integer.toString(0));
        } else {
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
            bw.write(Integer.toString(sum));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}