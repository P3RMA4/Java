package sem2.Timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class t1036 {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = consoleReader.readLine().split(" ");
        consoleReader.close();

        int n = Integer.parseInt(input[0]);
        int sum = Integer.parseInt(input[1]);

        if ((sum & 1) == 1)
            System.out.println("0\n");
        else {
            BigInteger dp[][] = new BigInteger[51][501];
            sum >>= 1;

            dp[0][0] = BigInteger.ONE;
            for (int i = 1; i <= sum; ++i)
                dp[0][i] = BigInteger.ZERO;

            for (int i = 1; i <= n; ++i)
                for (int j = 0; j <= sum; ++j) {
                    dp[i][j] = BigInteger.ZERO;
                    for (int d = 0; d <= 9; ++d)
                        if (j >= d)
                            dp[i][j] = dp[i][j].add(dp[i - 1][j - d]);
                }


            BigInteger result = dp[n][sum].multiply(dp[n][sum]);
            System.out.println(result);
        }
    }
}