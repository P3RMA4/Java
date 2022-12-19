package ex3;

import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Ввведите количество чисел Фибоначчи\n");
        int x = id.nextInt();

        Fib.WhileFib(x);
        Fib.ForFib(x);
    }

    static class Fib {
        static void WhileFib(int x) {
            System.out.println("\n\nверсия программы на основе оператора \"while\"");
            int i = x;
            long k = 0;
            long l = 1;
            long m = 1;
            while (i > 0) {
                System.out.printf("%d, ", m);
                m = k + l;
                k = l;
                l = m;
                i--;
            }
            System.out.println("\nконец цикла");
        }

        static void ForFib(int x) {
            System.out.println("\n\nверсия программы на основе оператора \"for\"");
            long k = 0;
            long l = 1;
            long m = 1;
            for (int x1 = x; x1 > 0; --x1) {
                System.out.printf("%d, ", m);
                m = k + l;
                k = l;
                l = m;
            }
            System.out.println("\nконец цикла");
        }
    }
}