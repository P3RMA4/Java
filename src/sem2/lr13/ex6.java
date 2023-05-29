package sem2.lr13;

import java.util.Arrays;

public class ex6 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1; i++) {
                int[] A = {6, 8, 3, 5, 1, 9};
                int sum = Arrays.stream(A).sum();
                    System.out.println(Thread.currentThread().getName() + "Максимальный элемент: " +(sum) );
                }


        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1; i++) {
                int[] A = {6, 8, 3, 5, 1, 9};
                int sum = Arrays.stream(A).sum();
                System.out.println(Thread.currentThread().getName() + "Максимальный элемент: " +(sum) );
            }


        });
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1; i++) {
                int[] A = {6, 8, 3, 5, 1, 9};
                int sum = Arrays.stream(A).sum();
                System.out.println(Thread.currentThread().getName() + "Максимальный элемент: " +(sum) );
            }


        });
        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 1; i++) {
                int[] A = {6, 8, 3, 5, 1, 9};
                int sum = Arrays.stream(A).sum();
                System.out.println(Thread.currentThread().getName() + "Максимальный элемент: " +(sum) );
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
