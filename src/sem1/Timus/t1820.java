package sem1.Timus;
import java.util.Scanner;

public class t1820 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int steaks = in.nextInt();
        int pan_capacity = in.nextInt();
        if (pan_capacity >= steaks){
            System.out.print("2");
        }else {
            if ((steaks * 2) % pan_capacity == 0){
                System.out.print((steaks * 2) / pan_capacity);
            }else {
                System.out.print((steaks * 2) / pan_capacity + 1);
            }
        }
    }
}