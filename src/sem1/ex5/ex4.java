package sem1.ex5;

public class ex4 {
    public static void main(String[] args) {
        //   Scanner id = new Scanner(System.in);
        Example myexample1 = new Example(12, 'A');
        Example myexample2 = new Example(65.1267);
    }

    static class Example {
        //класс, у которого есть символьное и целочисленное поле
        private char ch1;
        private int int1;

        //версия конструктора с двумя аргументами (целое число и символ – определяют значения полей)
        Example(int i, char c) {
            this.ch1 = c;
            this.int1 = i;
            int length = (int) (Math.log10(int1) + 1);
            double result = (double) ch1 + (double) int1 * 1 / Math.pow(10, length);
            System.out.println("result1 = " + result + "; ch = " + (double) ch1 + "; int = " + length + "\n");
        }

        //версия конструктора с одним аргументом типа double
        Example(double d) {
            //действительная часть аргумента определяет код символа (значение символьного поля)
            char ch1 = (char) d;
            //дробная часть (с учетом десятых и сотых) определяет значение целочисленного поля
            int1 = (int) ((d - (int) d) * 100);
            System.out.println("ch = " + ch1 + "; int = " + int1 + "\n");
        }
    }
}