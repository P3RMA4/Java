package ex3;
import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите порядковый номер дня недели");
        int day = id.nextInt();
        switch(day)
        {
            case 1:
                System.out.println(day + " День недели - понедельник");
                break;
            case 2:
                System.out.println(day + " День недели - вторник");
                break;
            case 3:
                System.out.println(day + " День недели - среда");
                break;
            case 4:
                System.out.println(day + " День недели - четверг");
                break;
            case 5:
                System.out.println(day + " День недели - пятница");
                break;
            case 6:
                System.out.println(day + " День недели - суббота");
                break;
            case 7:
                System.out.println(day + " День недели - воскресенье");
                break;
            default:
                System.out.println(day + " - некорректное значение");
                break;
        }
    }
}
