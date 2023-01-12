package ex6.ex8;

public class exm8 {
    static double getSr(int[] arr) {
        double sum = 0;
        for (int a : arr) {
            sum += a;
        }
        return sum / arr.length;
    }
}