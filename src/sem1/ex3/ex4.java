package sem1.ex3;
import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Ввведите первое целое число");
        int x = id.nextInt();
        System.out.println("Ввведите второе целое число");
        int y = id.nextInt();

        SortNums.WhileSortNums(x, y);
        SortNums.ForSortNums(x, y);
    }

    static class SortNums {
        static void WhileSortNums(int x, int y) {
            System.out.println("\n\nверсия программы на основе оператора \"while\"");
            if (x > y) {
                while (y <= x) {
                    System.out.printf("%d, ", y);
                    y++;
                }
            }
            else {
                while (x <= y) {
                    System.out.printf("%d, ", x);
                    x++;
                }
            }
            System.out.println("конец числового ряда");
        }

        static void ForSortNums(int x, int y) {
            System.out.println("\n\nверсия программы на основе оператора \"for\"");
            if (x > y) { // если x > y
                for (int y1 = y; y1 <= x; y1++) {
                    System.out.printf("%d, ", y1);
                }
            } else { // если y > x
                for (int x1 = x; x1 <= y; x1++) {
                    System.out.printf("%d, ", x1);
                }
            }
            System.out.println("конец числового ряда"); // Сообщение пользователю
        }
    }
}