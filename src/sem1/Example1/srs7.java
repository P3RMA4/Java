package sem1.Example1;

import java.util.Scanner;

public class srs7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваш возраст: ");
        int Birthday = in.nextInt();
        System.out.println("Год рождения : " +(2022-Birthday));
        in.close();    }
}
