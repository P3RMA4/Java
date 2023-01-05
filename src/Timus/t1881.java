package Timus;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class t1881 {
    public static void main(String str[]) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = consoleReader.readLine().split(" ");

        int h = Integer.parseInt(input[0]);
        int w = Integer.parseInt(input[1]);
        int n = Integer.parseInt(input[2]);

        int words[] = new int[n];
        for (int i = 0; i < n; i++) {
            words[i] = consoleReader.readLine().length();
        }

        int lineCounter = 1;
        int totalLL = -1;
        for (int i = 0; i < n; i++) {
            totalLL = totalLL + words[i] + 1;
            if (totalLL > w) {
                lineCounter++;
                totalLL = words[i];
            }
        }

        int result = lineCounter / h;
        if ((lineCounter % h) > 0) {
            result++;
        }

        System.out.println(result);
    }
}
