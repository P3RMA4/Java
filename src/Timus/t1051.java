package Timus;
import java.util.Scanner;

public class t1051 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        if (m > n){
            int t = m;
            m = n;
            n = t;
        }
        if (m == 1){
            System.out.print((n+1)/2);
        } else if (m % 3 == 0 || n % 3 == 0) {
            System.out.print("2");
        } else {
            System.out.print("1");
        }
    }
}