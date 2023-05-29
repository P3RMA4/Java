package sem1.Timus;
import java.util.Scanner;
public class t1869 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int number = input.nextInt();
                if (i < j) {
                    a[i] += number;
                    a[j] -= number;
                } else {
                    b[n - i - 1] += number;
                    b[n - j - 1] -= number;
                }
            }
        }

        int maxCount = 0;

        for (int i = 0; i < n; i++) {
            if (i > 0) {
                a[i] += a[i - 1];
                b[i] += b[i - 1];
            }
            if (a[i] > maxCount)
                maxCount = a[i];

            if (b[i] > maxCount)
                maxCount = b[i];
        }
        System.out.println((int) Math.ceil(maxCount / 36f));
    }
}
