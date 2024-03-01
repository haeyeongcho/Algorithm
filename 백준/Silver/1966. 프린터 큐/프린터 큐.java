import java.io.*;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());

        for (int test = 0; test < testCase; test++) {
            String[] input = br.readLine().split(" ");

            int N = Integer.parseInt(input[0]); // N: 문서의 개수
            int M = Integer.parseInt(input[1]); // M: 몇 번째로 인쇄되었는지 궁금한 문서가 현재 Queue에서 몇 번째에 놓여 있는지를 나타내는 정수

            int printCount = 0;

            LinkedList<Integer> que = new LinkedList<>();
            LinkedList<Integer> index = new LinkedList<>();

            String[] target = br.readLine().split(" ");

            for (int i = 0; i < N; i++) {
                que.add(Integer.parseInt(target[i])); // N개 문서의 중요도가 차례대로 주어진다
                index.add(i); // M이 출력되는 시점을 인덱스 파악하기 위해 que와 동일하게 동작
            }

            while (!que.isEmpty()) {
                int currentElement = que.poll();
                int currentIndex = index.poll();

                boolean hasBiggerPriority = false;

                for (int i = 0; i < que.size(); i++) {
                    if (currentElement < que.get(i)) {
                        que.add(currentElement);
                        index.add(currentIndex);
                        hasBiggerPriority = true;
                        break;
                    }
                }
                if (!hasBiggerPriority) {
                    printCount++;
                    if (currentIndex == M) {
                        bw.write(Integer.toString(printCount));
                        bw.newLine();
                        break;
                    }
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}