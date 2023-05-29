package sem1.ex3;
import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        if (id.hasNextInt()) {
            int Size = id.nextInt();
            if (Size > 0) {
                System.out.println("Размер массива равен "+ Size);
                int[] nums = new int[Size];
                int x = 0;
                int i = 0;
                while (x<Size) {
                    i++;
                    if (i%5 == 2) {
                        nums[x] = i;
                        System.out.println("Элемент массива ["+x+"] = " + nums[x]);
                        x++;
                    }
                }
                System.out.println("конец массива");
            }
            else {
                System.out.println("некорректное значенние");

            }
        }
        else {
            System.out.println("некорректное значенние");

        }
    }
}
