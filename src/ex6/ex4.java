package ex6;
import java.util.Scanner;
public class ex4 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Введите число для нахождения двойного факториала: ");
            int a = input.nextInt();
            Factorial1(a);
            System.out.println("Через рекурсию:\nn!! = " + Factorial2(a));
        }

        static void Factorial1(int a){
            int c = 1;
            int b = a % 2;
            if (b == 0) {
                for (int i = 1; i <= a; i++) {
                    if (i % 2 == 0) {
                        c = c * i;
                    }
                }
            }else{
                for (int i = 1; i <= a; i++) {
                    if (i % 2 == 1) {
                        c = c * i;
                    }
                }
            }
            System.out.println("Первый способ:\nn!! = " + c);
        }

        public static int Factorial2(int a){
            if (a <= 1){
                return 1;
            }else {
                return a * Factorial2(a - 2);
            }
        }
    }
