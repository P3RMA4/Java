package Timus;
import java.util.Scanner;
public class t1864 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double[] a = new double[n];
        double[] notDrunked = new double[n];

        for (int i = 0; i < n; i++)
            a[i] = input.nextDouble();

        double volume = getSum(a);
        double sr = volume * 1.0 / (n + 1);

        for (int i = 0; i < n; i++)
            if (a[i] - sr > 0)
                notDrunked[i] = a[i] - sr;
            else
                notDrunked[i] = 0;

        double d = getSum(notDrunked);

        for (double i : notDrunked)
            System.out.print((int) (100 * i / d + 0.0001) + " ");

    }

    private static double getSum(double[] arr){
        double sum = 0;

        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        return sum;
    }
}
