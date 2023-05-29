package sem1.Ex2;
import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = in.nextInt();

        if(num%7==1 && num%5==2)
        {
            System.out.println("Удовлетворяет");
        }
        else {
            System.out.println("Не делиться на 7 и 5 с остатками 1 и 2");
        }
        in.close();    }
}
