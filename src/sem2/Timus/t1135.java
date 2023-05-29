package sem2.Timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class t1135 {

    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(consoleReader.readLine());
        int close = 0;
        int result = 0;

        int i = 0;
        while (i < n) {
            char c = (char) consoleReader.read();
            if (c == '>') {
                close++;
                i++;
            } else if (c == '<') {
                result += close;
                i++;
            }
        }


        System.out.println(result);
    }
}
