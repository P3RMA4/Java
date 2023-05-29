package sem1.Example1;

import java.util.Scanner;

public class Srs10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int op1 = in.nextInt();
        System.out.println("Введите второе число число: ");
        int op2 = in.nextInt();
        System.out.println("Сумма ="+(op2+op1));
        System.out.println("Разность ="+(op2-op1));
        in.close();    }
}
