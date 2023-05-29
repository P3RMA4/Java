package sem2.lr9.Task1;

public class ex3 {
    public static void main(String[] args) {
    try {
        System.out.println("0");
        throw new RuntimeException("ошибка");
    } catch (NullPointerException e) {
        System.out.println("1");
    } catch (RuntimeException e) {
        System.out.println("2");
    } catch (Exception e) {
        System.out.println("3");
    }
    System.out.println("4");
}
}
