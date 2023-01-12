package Timus;
import java.util.Scanner;

public class t1409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int total = n + m;
        if (total >  10){
            total = 10;
        }else {
            total = total - 1;
        }
        System.out.print(total - n + " ");
        System.out.print(total - m);
    }
}