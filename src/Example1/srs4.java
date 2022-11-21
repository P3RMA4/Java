package Example1;

import java.util.Scanner;

public class srs4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название месяца ");
        String Month = in.nextLine();
        System.out.println("Введите количество дней в месяце");
        int day = in.nextInt();
        System.out.println("В "+Month+" "+day+" дней");
        in.close();    }
}
