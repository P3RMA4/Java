package sem2.Timus;
import java.util.Scanner;
public class t1005 {
    public static void main(String str[]) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int w[] = new int[n];

        for (int i = 0; i < n; i++)
            w[i] = input.nextInt();

        int difference = Integer.MAX_VALUE;
        for (int c = 0; c < 1 << n; c++) {

            int heap1Weight = 0;
            int heap2Weight = 0;
            int k = c;

            for (int i = 0; i < n; i++) {
                if ((k & 1) > 0)
                    heap1Weight += w[i];
                else
                    heap2Weight += w[i];

                k >>= 1;
            }
            difference = Math.min(difference, Math.abs(heap1Weight - heap2Weight));
        }

        System.out.println(difference);
    }
}