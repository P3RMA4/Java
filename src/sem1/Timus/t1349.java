package sem1.Timus;
import java.util.Scanner;

public class t1349 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int a = 1; a <= 98; a++) {
            for (int b = a + 1; b <= 99 ; b++) {
                for (int c = b + 1; c <= 100; c++) {
                    if(Math.pow(a, num) + Math.pow(b, num) == Math.pow(c, num)){
                        System.out.println(a + " "+ b +" "+ c);
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println("-1");
    }
}