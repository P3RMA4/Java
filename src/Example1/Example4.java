package Example1;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите свой номер:");
        int num = in.nextInt();
        System.out.println("Ваш номер " + num);
        in.close();    }
}
