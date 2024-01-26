import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] grid = new int[9][9];
        int max = 0;
        int[] index = new int[] {1, 1};

        for (int i = 0; i < grid.length; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = Integer.parseInt(input[j]);
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] > max) {
                    max = grid[i][j];
                    index[0] = i + 1;
                    index[1] = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(index[0] + " " + index[1]);
    }
}