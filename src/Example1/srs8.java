package Example1;

import java.util.Scanner;

public class srs8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int op1 = in.nextInt();
        System.out.println("Введите второе число число: ");
        int op2 = in.nextInt();
        System.out.println(op1+"+"+op2+"="+(op1+op2));
        in.close();    }
}
