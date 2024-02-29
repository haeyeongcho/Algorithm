import java.io.*;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int temp = 1;
        boolean err = false;

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());

            for (; temp <= input; temp++) {
                stack.push(temp);
                sb.append("+\n");
            }

            if (stack.peek() == input) {
                stack.pop();
                sb.append("-\n");
            } else {
                err = true;
            }
        }

        if (err) {
            bw.write("NO");
        } else {
            bw.write(String.valueOf(sb));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}