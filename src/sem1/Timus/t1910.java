package sem1.Timus;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class t1910 {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(consoleReader.readLine());
        int[] a = new int[n];
        StringTokenizer tokenizer = new StringTokenizer(consoleReader.readLine(), " ");
        consoleReader.close();

        for (int i = 0; i < n; i++)
            a[i] = Integer.parseInt(tokenizer.nextToken());

        int maxPower = 0;
        int position = 0;
        for (int i = 0; i < n - 2; i++) {
            int sum = a[i] + a[i + 1] + a[i + 2];
            if (sum > maxPower) {
                maxPower = sum;
                position = i + 2;
            }
        }

        System.out.println(maxPower + " " + position);
    }
}
