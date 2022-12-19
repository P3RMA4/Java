package ex3;
import java.util.Scanner;
import java.util.Random;
public class ex5 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Ввведите количество чисел в сумме");
        int x = id.nextInt();

        CalcNums.WhileCalcNums(x);
        CalcNums.ForCalcNums(x);
    }

    private static class CalcNums {
        private static void WhileCalcNums(int x) {
            System.out.println("\n\nверсия программы на основе оператора \"while\"");
            int sum = 0;
            Random random = new Random();
            int x1 = x;
            while (x1 > 0) {
                int nums = random.nextInt(1000);
                if (nums % 5 == 2 || nums % 3 == 1) {
                    System.out.printf("%d, ", nums);
                    sum = sum + nums;
                    x1--;
                }
            }
            System.out.printf("сумма чисел: %d", sum);
        }

        private static void ForCalcNums(int x) {
            System.out.println("\n\nверсия программы на основе оператора \"for\"");
            int sum = 0;
            for (int i = 0; x > 0; i++) {
                if (i % 5 == 2 || i % 3 == 1) {
                    System.out.printf("%d, ", i);
                    sum = sum + i;
                    x--;
                }
            }
            System.out.printf("сумма чисел: %d", sum);
        }
    }
}