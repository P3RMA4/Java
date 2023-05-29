package sem2.Timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class t1012 {

    public static void main(String str[]) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(consoleReader.readLine());
        int k = Integer.parseInt(consoleReader.readLine());

        BigInteger f1 = BigInteger.valueOf(k - 1);
        BigInteger f2 = BigInteger.valueOf(k * (k - 1));
        BigInteger bk1 = BigInteger.valueOf(k - 1);

        for (int i = 2; i < n; i++) {
            BigInteger next = (f1.add(f2)).multiply(bk1);
            f1 = f2;
            f2 = next;
        }
        System.out.println(f2);
    }
}