package sem1.Timus;
import java.util.Scanner;

public class t1209 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextInt();
        for (int i = 0; i < a; i++) {
            double b = in.nextInt();
            double c = (1+Math.sqrt(1+8*b-8))/2;
            double e = Math.round((1+Math.sqrt(1+8.0*b-8))/2);
            if (c == e) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
            if (i != a){
                System.out.print(" ");
            }
        }
    }
}