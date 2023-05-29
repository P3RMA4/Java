package sem1.OPD;

import java.util.Scanner;

public class LR3 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Введите колличество месяцев для выполнения проекта");
        double all = in.nextDouble();
        System.out.println("Введите месяц проверки");
        double day = in.nextDouble();
        System.out.println("Введите степень готовности проекта в %");
        double procent = in.nextDouble();
        System.out.println("Введите заплонированный бюджет");
        double money = in.nextDouble();
        System.out.println("Введите затраты во время проверки");
        double zatrati = in.nextDouble();

        double delay = day * 100 / procent;
        all = delay - all;
        System.out.println("\nВывод: ");
        System.out.println( "Срок задержки проекта составляет " + all +" Мес.");

        double pererashod = (zatrati * 100 / procent) - money;
        System.out.println("Перерасход составляет " + pererashod +" У.Е.");
    }
}
