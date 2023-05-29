package sem1.ex5;

public class ex6 {
    public static void main(String[] args) {
        //конструктор с 2-я аргументами
        Example myexample = new Example(2, 5);
        myexample.PrintInt();
        //конструктор с 1-м аргументом
        Example myexample1= new Example(1);
        myexample1.PrintInt();
        //метод с 2-я аргументами
        myexample.SetInt(3, 15);
        myexample.PrintInt();
        //метод с 1-м аргументом
        myexample.SetInt(-9);
        myexample.PrintInt();
    }

    static class Example {
        private static int min;
        private static int max;



        static void SetInt(int num1, int num2) {
            System.out.println("Метод SetInt() c 2-я аргументами");
            min = Math.min(Math.min(num1, min),num2);
            max = Math.max(Math.max(num1, max),num2);
        }

        static void SetInt(int num) {
            System.out.println("Метод SetInt() c 1-м аргументом");
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        static void PrintInt() {
            System.out.println("min = " + min);
            System.out.println("max = " + max);
        }

        Example(int num1, int num2) {
            System.out.println("Конструктор Example_6() c 2-я аргументами");
            min = Math.min(num1,num2);
            max = Math.max(num1,num2);
        }

        Example(int num) {
            System.out.println("Конструктор Example_6() c 1-м аргументом");
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
    }
}
