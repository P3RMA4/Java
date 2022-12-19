package Ex2;
import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = in.nextInt();
        String input = String.valueOf(num);   //input string
        String firstFourChars = "";   //substring containing first 4 characters

        if (input.length() == 4) {
            firstFourChars = input.substring(0, 1);
        }
        if (input.length() == 5) {
            firstFourChars = input.substring(0,2);
        }
        if (input.length() == 6) {
            firstFourChars = input.substring(0,3);
        }
        if (input.length() == 7) {
            firstFourChars = input.substring(1,4);
        }

        System.out.println(firstFourChars + " тысяч в этом числе");
    }
}
