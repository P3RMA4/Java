package sem2.lr13;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ex5 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1; i++) {
                Integer[] A = { 6, 8, 3, 5, 1, 9 };
                List<Integer> ints = Arrays.asList(A);
                System.out.println(Thread.currentThread().getName() + "Максимальный элемент: "+ Collections.max(ints));
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1; i++) {
                Integer[] A = { 6, 8, 3, 5, 1, 9 };
                List<Integer> ints = Arrays.asList(A);
                System.out.println(Thread.currentThread().getName() + "Максимальный элемент: "+ Collections.max(ints));
            }
        });
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1; i++) {
                Integer[] A = { 6, 8, 3, 5, 1, 9 };
                List<Integer> ints = Arrays.asList(A);
                System.out.println(Thread.currentThread().getName() + "Максимальный элемент: "+ Collections.max(ints));
            }
        });
        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 1; i++) {
                Integer[] A = { 6, 8, 3, 5, 1, 9 };
                List<Integer> ints = Arrays.asList(A);
                System.out.println(Thread.currentThread().getName() + "Максимальный элемент: "+ Collections.max(ints));
            }
        });
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        t4.start();
        t4.join();

    }
}