import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            if (input[0].equals("push_front")) {
                list.add(0, Integer.parseInt(input[1]));
            } else if (input[0].equals("push_back")) {
                list.add(Integer.parseInt(input[1]));
            } else if (input[0].equals("pop_front")) {
                if (list.isEmpty()) {
                    bw.write(Integer.toString(-1));
                    bw.newLine();
                } else {
                    int num = list.remove(0);
                    bw.write(Integer.toString(num));
                    bw.newLine();
                }
            } else if (input[0].equals("pop_back")) {
                if (list.isEmpty()) {
                    bw.write(Integer.toString(-1));
                    bw.newLine();
                } else {
                    int num = list.remove(list.size() - 1);
                    bw.write(Integer.toString(num));
                    bw.newLine();

                }
            } else if (input[0].equals("size")) {
                bw.write(Integer.toString(list.size()));
                bw.newLine();
            } else if (input[0].equals("empty")) {
                if (list.isEmpty()) {
                    bw.write(Integer.toString(1));
                    bw.newLine();
                } else {
                    bw.write(Integer.toString(0));
                    bw.newLine();
                }
            } else if (input[0].equals("front")) {
                if (list.isEmpty()) {
                    bw.write(Integer.toString(-1));
                    bw.newLine();
                } else {
                    bw.write(Integer.toString(list.get(0)));
                    bw.newLine();
                }
            } else if (input[0].equals("back")) {
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