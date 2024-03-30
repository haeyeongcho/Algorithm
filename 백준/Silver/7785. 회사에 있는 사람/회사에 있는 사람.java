import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        HashMap<String, String> record = new HashMap<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String log = st.nextToken();
            if (record.containsKey(name) && log.equals("leave")) {
                record.remove(name);
            } else {
                record.put(name, log);
            }
        }

        ArrayList<String> result = new ArrayList<>();

        for (Map.Entry<String, String> entry : record.entrySet()) {
            if (entry.getValue().equals("enter")) {
                result.add(entry.getKey());
            }
        }

        Collections.sort(result);

        for (int i = result.size() - 1; i >= 0; i--) {
            bw.write(result.get(i) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}