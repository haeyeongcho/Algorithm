import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] words = br.readLine().toCharArray();

        int numberOfAlphabets = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i] == '=') {
                if (i == 0) {
                    continue;
                }
                if (words[i - 1] == 'c') {
                    numberOfAlphabets--;
                } else if (words[i - 1] == 's') {
                    numberOfAlphabets--;
                } else if (words[i - 1] == 'z') {
                    if (i == 1) {
                        numberOfAlphabets--;
                    } else if (words[i - 2] == 'd') {
                        numberOfAlphabets -= 2;
                    } else {
                        numberOfAlphabets--;
                    }
                } else if (words[i - 1] == '=' || words[i - 1] == '-') {
                    continue;
                }
            } else if (words[i] == '-') {
                if (i == 0) {
                    continue;
                }
                if (words[i - 1] == 'c') {
                    numberOfAlphabets--;
                } else if (words[i - 1] == 'd') {
                    numberOfAlphabets--;
                } else if (words[i - 1] == '-' || words[i - 1] == '=') {
                    continue;
                }
            } else if (words[i] == 'j') {
                if (i == 0) {
                    numberOfAlphabets++;
                    continue;
                }
                if (words[i - 1] == 'l') {
                    numberOfAlphabets--;
                } else if (words[i - 1] == 'n') {
                    numberOfAlphabets--;
                }
            }
            numberOfAlphabets++;
        }
        System.out.println(numberOfAlphabets);
    }
}