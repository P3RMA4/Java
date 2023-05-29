package sem2.Timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class t1048 {


    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        int[] result = new int[n];

        IntStream.range(0, n).forEach(i -> {
            try {
                String[] input = in.readLine().split(" ");

                result[i] = Integer.parseInt(input[0]) + Integer.parseInt(input[1]);
                int j = i;
                while (result[j] > 9) {
                    result[j--] -= 10;
                    result[j]++;
                }
            } catch (IOException e) {
            }
        });

        IntStream.range(0, n).forEach(i -> System.out.print(result[i]));
        System.out.println();
    }
}