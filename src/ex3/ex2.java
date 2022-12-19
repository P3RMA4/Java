package ex3;
import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите день недели(кириллица, нижний регистр)");
        String day = id.nextLine();

        WeekDay.SwitchMethod(day);
    }

    static class WeekDay {

        static void SwitchMethod(String d) {
            String day = d;
            switch (day) {
                case "понедельник":
                    System.out.println(day + " это 1-ый день недели");
                    break;
                case "вторник":
                    System.out.println(day + " это 2-ой день недели");
                    break;
                case "среда":
                    System.out.println(day + " это 3-ий день недели");
                    break;
                case "четверг":
                    System.out.println(day + " это 4-ый день недели");
                    break;
                case "пятница":
                    System.out.println(day + " это 5-ый день недели");
                    break;
                case "суббота":
                    System.out.println(day + " это 6-ой день недели");
                    break;
                case "воскресенье":
                    System.out.println(day + " это 7-ой день недели");
                    break;
                default:
                    System.out.println(day + " некорректное значение дня недели");
                    break;
            }
        }

    }
}
