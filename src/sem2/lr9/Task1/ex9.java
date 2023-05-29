package sem2.lr9.Task1;

public class ex9 {
    public static class Main {
        public static int m() {
            try {
                System.out.println("0");
                return 55;    // выход из метода
            } finally {
                System.out.println("1");
            }
        }

        public static void main(String[] args) {
            System.out.println(m());
        }
    }
}
