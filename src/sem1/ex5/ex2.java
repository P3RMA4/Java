package sem1.ex5;
public class ex2 {
    public static void main(String[] args) {
        Example myexample = new Example();
        myexample.Setch('A', 'Z');
        myexample.showCharArray();
    }
    static class Example {
        // классом, у которого есть два символьных поля и метод.
        private char ch1;
        private char ch2;

        //Один из методов позволяет присвоить значение полю.
        public void Setch(char ch1, char ch2) {
            this.ch1 = ch1;
            this.ch2 = ch2;
        }

        //Он возвращает результат, и у него нет аргументов.
        public void showCharArray() {
        /*При вызове метод выводит в консольное окно все символы из кодовой таблицы, которые находятся «между» символами,
являющимися значениями полей объекта (из которого вызывается метод*/
            int int1 = ch1;
            int int2 = ch2;
            if (ch1 > ch2) {
                int1 = ch2;
                int2 = ch1;
            }
            int schet = 1;
            for (int i = int1; i <= int2; i++) {
                System.out.println(schet + " symbol = " + (char) i);
                schet++;
            }
        }
    }
}