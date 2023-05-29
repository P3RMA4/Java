package sem2.lr9.Task1;

public class ex2 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка");
        }
        catch (Exception e) {
            System.out.println("2 " + e);
        }
        System.out.println("3");
    }
}
