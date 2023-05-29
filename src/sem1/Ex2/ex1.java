package sem1.Ex2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = in.nextInt();
        if(num%3==0) //В нашем случае результатом будет 5, значит проверка не пройдет
        {
            System.out.println("Делиться без остатка");
        }
        else
        {
            System.out.println("Делиться с остатком");
        }
        in.close();    }
}