package sem1.Timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
public class t1108 {
    private static void getInheritance(int n) {
        BigInteger num, denom;
        num = denom = BigInteger.valueOf(1);
        BigInteger prev = BigInteger.valueOf(0);
        for (int i = 1; i <= n; i++) {
            BigInteger part = denom.divide(num);

            if (denom.mod(num).compareTo(BigInteger.valueOf(0)) == 0)
                part = part.add(BigInteger.valueOf(1));

            if (part.compareTo(prev) <= 0)
                part = prev.add(BigInteger.valueOf(1));

            BigInteger tNum = num, tDenom = denom;
            num = part.multiply(tNum).subtract(tDenom);
            denom = tDenom.multiply(part);
            prev = part;

            System.out.println(part);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        getInheritance(Integer.parseInt(in.readLine()));
    }

}
