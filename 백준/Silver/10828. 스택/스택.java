import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> stack = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String command = br.readLine();
            StringTokenizer st = new StringTokenizer(command);
            if (st.nextToken().equals("push")) {
                stack.add(Integer.parseInt(st.nextToken()));
            } else if (command.equals("pop")) {
                if (stack.size() <= 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.remove(stack.size() - 1));
                }
            } else if (command.equals("size")) {
                System.out.println(stack.size());
            } else if (command.equals("empty")) {
                if (stack.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (command.equals("top")) {
                if (stack.size() <= 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.get(stack.size() - 1));
                }
            }
        }
    }
}