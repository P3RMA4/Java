package sem2.lr9.Task1;

public class ex11 {
    public static class Main {
        public static void main(String[] args) {
            try {
                System.out.println("0");
                throw new NullPointerException("ошибка");
            } catch (NullPointerException e) {
                System.out.println("1");
            } finally {
                System.out.println("2");
            }
            System.out.println("3");
        }
    }
}
