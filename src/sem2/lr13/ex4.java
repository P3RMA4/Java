package sem2.lr13;
public class ex4 {
    public static void main(String[] args) throws InterruptedException {
        Thread t0 = new Thread(() -> {
            for (int i = 0; i < 1; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        });
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1; i++) {
                System.out.println(Thread.currentThread().getName());

            }

        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1; i++) {
                System.out.println(Thread.currentThread().getName());

            }

        });
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1; i++) {
                System.out.println(Thread.currentThread().getName());

            }

        });
        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 1; i++) {
                System.out.println(Thread.currentThread().getName());

            }

        });
        Thread t5 = new Thread(() -> {
            for (int i = 0; i < 1; i++) {
                System.out.println(Thread.currentThread().getName());

            }

        });
        Thread t6 = new Thread(() -> {
            for (int i = 0; i < 1; i++) {
                System.out.println(Thread.currentThread().getName());

            }

        });
        Thread t7 = new Thread(() -> {
            for (int i = 0; i < 1; i++) {
                System.out.println(Thread.currentThread().getName());

            }

        });
        Thread t8 = new Thread(() -> {
            for (int i = 0; i < 1; i++) {
                System.out.println(Thread.currentThread().getName());

            }

        });
        Thread t9 = new Thread(() -> {
            for (int i = 0; i < 1; i++) {
                System.out.println(Thread.currentThread().getName());

            }

        });

        t0.start();
        t0.join();
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        t4.start();
        t4.join();
        t5.start();
        t5.join();
        t6.start();
        t6.join();
        t7.start();
        t7.join();
        t8.start();
        t8.join();
        t9.start();
        t9.join();

    }
}