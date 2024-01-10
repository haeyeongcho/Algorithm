import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int count = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());
        int result = 0;
        int[] cards = new int[count];
        String cards_list = br.readLine();
        StringTokenizer cards_list_token = new StringTokenizer(cards_list);
        for (int i = 0; i < cards.length; i++) {
            cards[i] = Integer.parseInt(cards_list_token.nextToken());
        }
        for (int i = 0; i < cards.length - 2; i++) {
            for (int j = 1 + i; j < cards.length - 1; j++) {
                for (int k = 1 + j; k < cards.length; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if (sum == max) {
                        result = sum;
                        break;
                    } else if (sum < max && sum > result) {
                        result = sum;
                    }
                }
            }
        }
        bw.write(Integer.toString(result));

        bw.flush();
        bw.close();
        br.close();
    }
}