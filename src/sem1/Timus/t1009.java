package sem1.Timus;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class t1009 {
    static BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

    private static int checkNumber(int n, int radix) {
        if (n <= 0) return 1;
        if (n == 1) return radix - 1;
        else return (checkNumber(n - 1, radix) + checkNumber(n - 2, radix)) * (radix - 1);
    }

    public static void main(String str[]) throws IOException {
        int n = Integer.parseInt(consoleReader.readLine());
        int radix = Integer.parseInt(consoleReader.readLine());
        System.out.println(checkNumber(n, radix));
    }
}
