import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> stack = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String command = br.readLine();
            StringTokenizer st = new StringTokenizer(command);
            if (st.nextToken().equals("push")) {
                stack.add(Integer.parseInt(st.nextToken()));
            } else if (command.equals("pop")) {
                if (stack.size() <= 0) {
                    bw.write(Integer.toString(-1));
                    bw.newLine();
                } else {
                    bw.write(Integer.toString(stack.remove(stack.size() - 1)));
                    bw.newLine();
                }
            } else if (command.equals("size")) {
                bw.write(Integer.toString(stack.size()));
                bw.newLine();
            } else if (command.equals("empty")) {
                if (stack.isEmpty()) {
                    bw.write(Integer.toString(1));
                    bw.newLine();
                } else {
                    bw.write(Integer.toString(0));
                    bw.newLine();
                }
            } else if (command.equals("top")) {
                if (stack.size() <= 0) {
                    bw.write(Integer.toString(-1));
                    bw.newLine();
                } else {
                    bw.write(Integer.toString(stack.get(stack.size() - 1)));
                    bw.newLine();
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}