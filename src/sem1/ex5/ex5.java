package sem1.ex5;

public class ex5 {
    public static void main(String[] args) {
        //присвоение значения полю через конструктор
        Example myexample = new Example(21);
        System.out.println("Число = " + myexample.PrintInt());

        //присвоение значения полю через метод с аргументом
        myexample.Set(15);
        System.out.println("Число = " + myexample.PrintInt());

        //присвоение значения больше 100 полю через метод с аргументом
        myexample.Set(125);
        System.out.println("Число = " + myexample.PrintInt());

        //присвоение значения меньше 0 полю через метод с аргументом
        myexample.Set(-15);
        System.out.println("Число = " + myexample.PrintInt());

        //присвоение значение полю через метод без аргуметов
        myexample.Set();
        System.out.println("Число = " + myexample.PrintInt());
    }

    static class Example {
        //закрытое целочисленное поле
        private int int1;

        //Значение полю присваивается с помощью открытого метода.
        public void Set(int n) {
            System.out.println("Метод Set() c аргументом");
            int1 = n;
            //если переданное аргументом методу значение превышает 100, то значением полю присваивается число 100.
            if (n >= 100) {
                int1 = 100;
            }
            //если переданное аргументом методу значение меньше 0, то значением полю присваивается число 0.
            if (n <= 0) {
                int1 = 0;
            }
        }

        //Если методы вызывается без аргументов, то поле получает нулевое значение.
        public void Set() {
            System.out.println("Метод Set() без аргумента");
            int1 = 0;
        }

        //метод, позволяющий проверить значение поля.
        public int PrintInt() {
            return int1;
        }

        //конструктор, который работает по тому же принципу что и метод для присваивания значения полю.
        Example(int int1) {
            System.out.println("Example() конструктор");
            this.Set(int1);
        }
    }
}
