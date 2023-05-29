package sem1.ex5;
import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите num1");
        int int1 = id.nextInt();
        System.out.println("Введите num2");
        int int2 = id.nextInt();
        Example myexample1 = new Example();
        Example myexample2 = new Example(int1);
        Example myexample3 = new Example(int1,int2);
    }
    static class Example {
        // классом, у которого есть два целочисленных поля.
        private int num1;
        private int num2;

        //конструктор, позволяющий создавать объекты без передачи аргументов
        Example(){
            System.out.println("Koнcтpyиpoвaниe объекта test Example(1)\n");
        }
        //конструктор, позволяющий создавать объекты с передачей одного аргумента
        Example(int num1){
            System.out.println("Koнcтpyиpoвaниe объекта Example(2)");
            this.num1 = num1;
            System.out.println("num1^num1 = "+exponentOwnPow (num1)+"\n");
        }
        public int exponentOwnPow (int num1) {
            this.num1 = num1;
            int result=1;
            for (int i=1; i <= num1;i++) {
                result = num1*result;
            }
            return result;
        }
        //конструктор, позволяющий создавать объекты с передачей двух аргументов
        Example(int num1, int num2){
            System.out.println("Koнcтpyиpoвaниe объекта Example(3)");
            this.num1 = num1;
            this.num2 = num2;
            System.out.println("num1^num2 = "+exponentPow (num1,num2)+"\n");
        }
        public int exponentPow(int n1, int n2){
            n1 = num1;
            n2 = num2;
            int result=1;
            for (int i=1; i <= num2;i++) {
                result = num1*result;
            }
            return result;
        }
    }
}