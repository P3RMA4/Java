package sem2.Timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class t1017 {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(consoleReader.readLine());
        consoleReader.close();

        System.out.println(generateCases(n)[n][n] - 1);
    }

    private static long[][] generateCases(int n) {
        long[][] a = new long[n + 1][n + 1];
        a[0][0] = 1;

        for (int i = 0; i < n + 1; i++) {
            for (int j = 1; j <= i; j++)
                a[i][j] += a[i - j][j - 1];

            for (int j = 1; j < n + 1; j++)
                a[i][j] += a[i][j - 1];

        }

        return a;
    }

}
